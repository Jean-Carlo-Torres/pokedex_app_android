package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.pokedex.R
import br.com.pokedex.ui.components.FooterBar

@Composable
fun PokemonFavoritoScreen(navController: NavController?) {
    Text(
        text = "Favoritos",
        fontSize = 18.sp,
        fontWeight = FontWeight(500),
        modifier = Modifier.padding(16.dp)
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        padraoImagem(imagem = painterResource(id = R.drawable.placeholder))
        padraoTextoPrimario(text = "Você não favoritou nenhum Pokémon :( ")
        padraoTextoSecundario(text = "Clique no ícone de coração dos seus pokémons favoritos e eles aparecerão aqui.")
    }
    if (navController != null) {
        FooterBar(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
private fun PokemonFavoritoScreenPreview() {
    PokemonFavoritoScreen(navController = null)
}