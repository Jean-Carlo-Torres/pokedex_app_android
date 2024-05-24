package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import br.com.pokedex.model.PokemonViewModel
import br.com.pokedex.ui.components.FooterBar
import br.com.pokedex.ui.components.ListaCardPokemon
import br.com.pokedex.ui.components.SearchTextField
import br.com.pokedex.ui.components.cards.*

@Composable
fun ListaPokemonScreen(navController: NavController?, viewModel: PokemonViewModel) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(bottom = 72.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
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

            var searchText = ""
            var text by remember {
                mutableStateOf(searchText)
            }
            SearchTextField(
                searchText = text,
                onSearchChange = {
                    text = it
                }
            )
            val searchedPokemons = remember(text) {
                if (text.isNotBlank()){
                    pokemonList.filter { pokemon ->
                        pokemon.nome.contains(text, ignoreCase = true)
                    }
                } else {
                    pokemonList
                }
            }

            pokemonList.forEachIndexed { index, pokemon ->
                if (text.isBlank()){
                    ListaCardPokemon(
                        pokemon = pokemon,
                        onClick = {
                            navController?.navigate("cardPokemonScreen/$index")
                        },
                        viewModel = viewModel
                    )
                } else {
                    if (searchedPokemons.contains(pokemon)){
                        ListaCardPokemon(
                            pokemon = pokemon,
                            onClick = {
                                navController?.navigate("cardPokemonScreen/$index")
                            },
                            viewModel = viewModel
                        )
                    }
                }
            }
        }
        if (navController != null) {
            FooterBar(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ListaPokemonScreenPreview() {
    ListaPokemonScreen(navController = null,  viewModel = viewModel())
}