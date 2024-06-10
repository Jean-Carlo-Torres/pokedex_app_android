package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.pokedex.model.UserViewModel
import br.com.pokedex.ui.components.FooterBar

@Composable
fun PerfilUsuarioScreen(navController: NavController?, userViewModel: UserViewModel?) {

    val user = userViewModel?.user
    LaunchedEffect(userViewModel?.user?.id) {
        user?.id?.let { userViewModel?.reloadUser(it) }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp, bottom = 100.dp)
    ) {
        TituloPrincipal("Informações da conta")
        var nome: String?
        var email: String?
        var senha: String?

        if (user != null) {
            nome = user?.nome
            email = user?.email
            senha = user?.senha
        } else {
            nome = "Não informado"
            email = "Não informado"
            senha = "Não informado"
        }

        if (nome != null) {
            ExibeDadosDoUsuario("Nome", nome, onClick = {
                navController?.navigate("trocarNomePerfil")
            })
        }
        if (email != null) {
            ExibeDadosDoUsuario("Email", email, onClick = {
                navController?.navigate("trocarEmailPerfil")
            })
        }
        if (senha != null) {
            ExibeDadosDoUsuario(
                "Senha",
                if (senha.isNotBlank()) {
                    "•".repeat(senha.length)
                } else {
                    "Senha"
                },
                onClick = {
                    navController?.navigate("trocarSenhaPerfil")
                }
            )
        }

        TituloPrincipal("Idioma")
        TextoESubtexto(
            texto = "Idioma da interface",
            subtexto = "Português (PT-BR)"
        )
        TextoESubtexto(
            texto = "Idioma de informações em jogo",
            subtexto = "English (US)"
        )

        TituloPrincipal(texto = "Geral")
        TextoESubtexto(
            texto = "Versão",
            subtexto = "0.0.1"
        )
        TextoESubtexto(
            texto = "Termos e condições",
            subtexto = "Tudo o que você precisa saber."
        )
        TextoESubtexto(
            texto = "Central de ajuda",
            subtexto = "Precisa de ajuda? Fale conosco."
        )
        TextoESubtexto(
            texto = "Sobre",
            subtexto = "Saiba mais sobre o app."
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {
                userViewModel?.userIsLogged(false)
                navController?.navigate("onboardingScreen")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Icon(
                imageVector = Icons.Default.ExitToApp,
                contentDescription = null
            )
            Text(
                text = "Sair da conta",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
    if (navController != null) {
        FooterBar(navController = navController)
    }
}

@Composable
fun ExibeDadosDoUsuario(texto: String, subtexto: String, onClick: () -> Unit) {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextoESubtexto(
            texto = texto,
            subtexto = subtexto
        )
        IconButton(onClick = onClick) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null
            )
        }
    }
}

@Composable
private fun TituloPrincipal(texto: String) {
    Text(
        text = texto,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(
            top = 12.dp
        )
    )
}

@Composable
private fun TextoESubtexto(texto: String, subtexto: String) {
    Column(
        Modifier.padding(top = 12.dp)
    ) {
        Text(
            text = texto,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )
        Text(
            text = subtexto,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PerfilUsuarioScreenPreview() {
    PerfilUsuarioScreen(navController = null, userViewModel = null)
}