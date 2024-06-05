package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import br.com.pokedex.model.UserViewModel
import br.com.pokedex.model.Usuario
import br.com.pokedex.ui.components.FooterBar

@Composable
fun PerfilUsuarioScreen(navController: NavController?, userViewModel: UserViewModel?) {

    val user = userViewModel?.user
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
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
            TextoESubtexto(
                texto = "Nome",
                subtexto = nome
            )
        }
        if (email != null) {
            TextoESubtexto(
                texto = "Email",
                subtexto = email
            )
        }
        if (senha != null) {
            TextoESubtexto(
                texto = "Senha",
                subtexto = if (senha.isNotBlank()) {
                    "•".repeat(senha.length)
                } else {
                    "Senha"
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

        TituloPrincipal(texto = "Outros")
        Text(
            text = "Sair",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Red,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Você entrou como $nome",
        )
    }
    if (navController != null) {
        FooterBar(navController = navController)
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