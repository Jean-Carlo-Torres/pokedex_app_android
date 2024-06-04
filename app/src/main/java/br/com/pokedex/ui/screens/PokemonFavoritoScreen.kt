package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
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
import br.com.pokedex.model.Usuario
import br.com.pokedex.repository.UserRepository
import br.com.pokedex.ui.components.FooterBar
import br.com.pokedex.ui.components.ListaCardPokemon
import br.com.pokedex.ui.components.cards.BeedrillListData
import br.com.pokedex.ui.components.cards.BlastoiseListData
import br.com.pokedex.ui.components.cards.BulbasaurListData
import br.com.pokedex.ui.components.cards.CharizardListData
import br.com.pokedex.ui.components.cards.CharmanderListData
import br.com.pokedex.ui.components.cards.CharmeleonListData
import br.com.pokedex.ui.components.cards.CleifairyListData
import br.com.pokedex.ui.components.cards.DugtrioListData
import br.com.pokedex.ui.components.cards.IvysaurListData
import br.com.pokedex.ui.components.cards.KoffingListData
import br.com.pokedex.ui.components.cards.LickitungListData
import br.com.pokedex.ui.components.cards.MewListData
import br.com.pokedex.ui.components.cards.OnixListData
import br.com.pokedex.ui.components.cards.PikachuListData
import br.com.pokedex.ui.components.cards.SquirtleListData
import br.com.pokedex.ui.components.cards.VenusaurListData
import br.com.pokedex.ui.components.cards.WartortleListData
import kotlinx.coroutines.launch

@Composable
fun PokemonFavoritoScreen(navController: NavController?, userViewModel: UserViewModel) {
    val favoritePokemons = userViewModel.user?.pokemonsFavoritos

    val pokemonList = listOf(
        BulbasaurListData(),
        IvysaurListData(),
        VenusaurListData(),
        CharmanderListData(),
        CharmeleonListData(),
        CharizardListData(),
        SquirtleListData(),
        WartortleListData(),
        BlastoiseListData(),
        BeedrillListData(),
        PikachuListData(),
        CleifairyListData(),
        DugtrioListData(),
        OnixListData(),
        LickitungListData(),
        KoffingListData(),
        MewListData()
    )

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Favoritos",
            fontSize = 18.sp,
            fontWeight = FontWeight(500),
            modifier = Modifier.padding(16.dp)
        )

        if (favoritePokemons?.isEmpty() == true) {
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
                modifier = Modifier.padding(top = 16.dp, start = 8.dp, end = 8.dp, bottom = 84.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(pokemonList.filter { pokemon ->
                    favoritePokemons?.contains(pokemon.nome) == true
                }) { pokemon ->
                    ListaCardPokemon(pokemon = pokemon, viewModel = userViewModel, onClick = {
                        navController?.navigate("cardPokemonFavoritoScreen/${pokemon.numero}")
                    })
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
    PokemonFavoritoScreen(navController = null, userViewModel = viewModel())
}