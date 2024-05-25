package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import br.com.pokedex.model.PokemonViewModel
import br.com.pokedex.ui.activity.ui.theme.Gray800
import br.com.pokedex.ui.components.FooterBar
import br.com.pokedex.ui.components.ListaCardPokemon
import br.com.pokedex.ui.components.SearchTextField
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

@Composable
fun ListaPokemonScreen(navController: NavController?, viewModel: PokemonViewModel) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
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
                if (text.isNotBlank()) {
                    pokemonList.filter { pokemon ->
                        pokemon.nome.contains(text, ignoreCase = true)
                    }
                } else {
                    pokemonList
                }
            }

            Button(
                onClick = {
                    navController?.navigate("pokemonType")
                },
                modifier = Modifier
                    .width(156.dp)
                    .height(42.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Gray800,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Todos os tipos")
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null
                )
            }

            pokemonList.forEachIndexed { index, pokemon ->
                if (text.isBlank()) {
                    ListaCardPokemon(
                        pokemon = pokemon,
                        onClick = {
                            navController?.navigate("cardPokemonScreen/$index")
                        },
                        viewModel = viewModel
                    )
                } else {
                    if (searchedPokemons.contains(pokemon)) {
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
    ListaPokemonScreen(navController = null, viewModel = viewModel())
}