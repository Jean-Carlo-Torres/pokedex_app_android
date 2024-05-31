package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import br.com.pokedex.R
import br.com.pokedex.model.PokemonViewModel
import br.com.pokedex.model.UserViewModel
import br.com.pokedex.ui.components.FooterBar
import br.com.pokedex.ui.components.ListaCardPokemon

@Composable
fun PokemonFavoritoScreen(navController: NavController?, viewModel: UserViewModel) {
    val favoritePokemons = viewModel.favoritePokemons

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Favoritos",
            fontSize = 18.sp,
            fontWeight = FontWeight(500),
            modifier = Modifier.padding(16.dp)
        )

        if (favoritePokemons.isEmpty()) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                padraoImagem(imagem = painterResource(id = R.drawable.placeholder))
                padraoTextoPrimario(text = "Você não favoritou nenhum Pokémon :( ")
                padraoTextoSecundario(text = "Clique no ícone de coração dos seus pokémons favoritos e eles aparecerão aqui.")
            }
        } else {
            LazyColumn(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(favoritePokemons) { pokemon ->
                    ListaCardPokemon(pokemon = pokemon, viewModel = viewModel)
                }
            }
        }
    }
    if (navController != null) {
        FooterBar(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
private fun PokemonFavoritoScreenPreview() {
    PokemonFavoritoScreen(navController = null,  viewModel = viewModel())
}