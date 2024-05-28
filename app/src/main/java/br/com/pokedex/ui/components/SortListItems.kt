package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.PokemonViewModel

typealias SortFunction = (List<PokemonListaItem>) -> Unit

@Composable
fun SortListItems(
    navController: NavController?,
    viewModel: PokemonViewModel
) {
    var pokemonsList = viewModel.pokemonsList

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        PageHeader(
            title = "Selecione a ordem",
            onClick = {
                navController?.popBackStack()
            }
        )
        Column(
            modifier = Modifier.padding(top = 32.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ButtonTypeDefault(text = "Menor número", onClick = {
                viewModel.sortedListIndex = 1
                pokemonsList.sortBy { it.numero }
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Maior número", onClick = {
                viewModel.sortedListIndex = 2
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "A - Z", onClick = {
                viewModel.sortedListIndex = 3
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Z - A", onClick = {
                viewModel.sortedListIndex = 4
                navController?.popBackStack()
            })
        }
    }
}

@Preview
@Composable
fun SortListItemsPreview() {
    SortListItems(null, PokemonViewModel())
}