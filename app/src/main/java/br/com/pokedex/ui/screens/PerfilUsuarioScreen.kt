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
import androidx.navigation.NavController
import br.com.pokedex.model.UsuarioViewModel
import br.com.pokedex.ui.components.FooterBar

@Composable
fun PerfilUsuarioScreen(navController: NavController?, usuarioViewModel: UsuarioViewModel) {
    val usuario = usuarioViewModel.usuario

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TituloPrincipal("Informações da conta")
        TextoESubtexto(
            texto = "Nome",
            subtexto = usuario.nome
        )
        TextoESubtexto(
            texto = "Email",
            subtexto = usuario.email
        )
        TextoESubtexto(
            texto = "Senha",
            subtexto = usuario.senha
        )

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
            text = "Você entrou como ${usuario.nome}",
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
    val usuarioViewModel = UsuarioViewModel().apply {
        updateUsuario("Jean Carlo", "jean.carlo@gmail.com", "12345678")
    }
    PerfilUsuarioScreen(
        navController = null,
        usuarioViewModel = usuarioViewModel
    )
}