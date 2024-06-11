package br.com.pokedex.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.pokedex.R
import br.com.pokedex.ui.components.GenericButton
import br.com.pokedex.ui.theme.PokedexTheme

@Composable
fun LoginSucessoScreen(navController: NavController?) {
    PokedexTheme {
        Surface {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = 100.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 32.dp
                    ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.group41),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(420.dp)
                )
                padraoTextoPrimario("Bem-vindo de volta, Treinador!")
                padraoTextoSecundario("Esperamos que tenha tido uma longa jornada desde a última vez em que nos visitou.")

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    GenericButton(text = "Continuar", onClick = {
                        navController?.navigate("listaPokemonScreen")
                    })
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LoginSucessoScreenPreview() {
    LoginSucessoScreen(navController = null)
}