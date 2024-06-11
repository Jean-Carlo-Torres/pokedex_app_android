package br.com.pokedex.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.pokedex.R
import br.com.pokedex.ui.activity.ui.theme.PokedexTheme
import br.com.pokedex.ui.components.GenericButton

@Composable
fun CadastroRealizadoScreen(navController: NavController?) {
    PokedexTheme {
        Surface {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .background(
                        color = Color.Transparent
                    )
                    .paint(
                        painter = painterResource(id = R.drawable.path),
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.TopStart
                    )
            ) { }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = 200.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 32.dp
                    ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                padraoImagem(imagem = painterResource(id = R.drawable.image146))
                padraoTextoPrimario("Sua conta foi criada com Sucesso!")
                padraoTextoSecundario("Seja bem-vindo, treinador! Estamos animados para acompanhar sua jornada.")
                Spacer(modifier = Modifier.weight(1f))
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
private fun CadastroRealizadoScreenPreview() {
    CadastroRealizadoScreen(navController = null)
}