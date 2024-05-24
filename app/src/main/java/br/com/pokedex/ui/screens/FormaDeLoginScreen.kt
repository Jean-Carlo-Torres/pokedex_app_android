package br.com.pokedex.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.pokedex.R
import br.com.pokedex.ui.components.AppleNoFillButton
import br.com.pokedex.ui.components.GenericButton
import br.com.pokedex.ui.components.GoogleNoFillButton
import br.com.pokedex.ui.components.PageHeader

@Composable
fun FormaDeLoginScreen(navController: NavController?){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp,
                top = 48.dp
            ),
    ) {
        PageHeader(onClick = {
            navController?.popBackStack()
        }, title = "Entrar")
        Image(
            painter = painterResource(id = R.drawable.image147),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(380.dp)
                .padding(top = 50.dp, bottom = 16.dp)
        )
        Text(
            text = "Que bom te ver aqui novamente!",
            fontSize = 26.sp,
            fontWeight = FontWeight(500),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Como deseja se conectar?",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    top = 8.dp,
                    bottom = 32.dp
                )
                .align(Alignment.CenterHorizontally)
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppleNoFillButton()
            GoogleNoFillButton()
            GenericButton(
                text = "Continuar com um e-mail",
                onClick = {
                    navController?.navigate("formularioDeLoginScreen")
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FormaDeLoginScreenPreview() {
    FormaDeLoginScreen(navController = null)
}