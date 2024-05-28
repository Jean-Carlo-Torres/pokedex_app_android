package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
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
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.activity.ui.theme.ElementBugColor
import br.com.pokedex.ui.activity.ui.theme.ElementDarkColor
import br.com.pokedex.ui.activity.ui.theme.ElementDragonColor
import br.com.pokedex.ui.activity.ui.theme.ElementElectricColor
import br.com.pokedex.ui.activity.ui.theme.ElementFairyColor
import br.com.pokedex.ui.activity.ui.theme.ElementFightColor
import br.com.pokedex.ui.activity.ui.theme.ElementFireColor
import br.com.pokedex.ui.activity.ui.theme.ElementFlyingColor
import br.com.pokedex.ui.activity.ui.theme.ElementGhostColor
import br.com.pokedex.ui.activity.ui.theme.ElementGrassColor
import br.com.pokedex.ui.activity.ui.theme.ElementGroundColor
import br.com.pokedex.ui.activity.ui.theme.ElementIceColor
import br.com.pokedex.ui.activity.ui.theme.ElementNormalColor
import br.com.pokedex.ui.activity.ui.theme.ElementPoisonColor
import br.com.pokedex.ui.activity.ui.theme.ElementPsychicColor
import br.com.pokedex.ui.activity.ui.theme.ElementRockColor
import br.com.pokedex.ui.activity.ui.theme.ElementSteelColor
import br.com.pokedex.ui.activity.ui.theme.ElementWaterColor
import br.com.pokedex.ui.activity.ui.theme.Gray800
import br.com.pokedex.ui.components.FilterElementType
import br.com.pokedex.ui.components.FooterBar
import br.com.pokedex.ui.components.ListaCardPokemon
import br.com.pokedex.ui.components.SearchTextField
import br.com.pokedex.ui.components.SortListPokemon
import br.com.pokedex.ui.components.cards.*

@Composable
fun ListaPokemonScreen(navController: NavController?, viewModel: PokemonViewModel) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp, bottom = 84.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            var pokemonList = listOf(
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

            val selectedElementType = viewModel.selectedElementType
            val filteredPokemonList = remember(selectedElementType) {
                if (selectedElementType != null) {
                    pokemonList.filter { pokemon ->
                        pokemon.elementTag?.contains(selectedElementType) == true
                    }
                } else {
                    pokemonList
                }
            }
            val sortListIndex = viewModel.sortedListIndex


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                FilterElementType(navController, viewModel)
                SortListPokemon(navController, viewModel)
            }

            pokemonList = when (sortListIndex) {
                1 -> pokemonList.sortedBy { it.numero }
                2 -> pokemonList.sortedByDescending { it.numero }
                3 -> pokemonList.sortedBy { it.nome }
                4 -> pokemonList.sortedByDescending { it.nome }
                else -> pokemonList
            }

            pokemonList.forEach { pokemon ->
                if (text.isBlank() && selectedElementType == null) {
                    ListaCardPokemon(
                        pokemon = pokemon,
                        onClick = {
                            navController?.navigate("cardPokemonScreen/${pokemon.numero}")
                        },
                        viewModel = viewModel
                    )
                } else {
                    if (searchedPokemons.contains(pokemon) || selectedElementType?.let {
                            pokemon.elementTag?.contains(it)
                        } == true) {
                        ListaCardPokemon(
                            pokemon = pokemon,
                            onClick = {
                                navController?.navigate("cardPokemonScreen/${pokemon.numero}")
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