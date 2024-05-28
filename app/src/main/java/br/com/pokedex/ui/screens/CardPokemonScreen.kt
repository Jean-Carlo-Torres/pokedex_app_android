package br.com.pokedex.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import br.com.pokedex.model.PokemonViewModel
import br.com.pokedex.ui.components.CardPokemon
import br.com.pokedex.ui.components.cards.*
import br.com.pokedex.ui.theme.PokedexTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardPokemonScreen(navController: NavController?, pokemonNumber: String, viewModel: PokemonViewModel?) {
    var pokemonList = listOf(
        BulbasaurData(),
        IvysaurData(),
        VenusaurData(),
        CharmanderData(),
        CharmeleonData(),
        CharizardData(),
        SquirtleData(),
        WartortleData(),
        BlastoiseData(),
        BeedrillData(),
        PikachuData(),
        CleifairyData(),
        DugtrioData(),
        OnixData(),
        LickitungData(),
        KoffingData(),
        MewData()
    )

    val sortListIndex = viewModel?.sortedListIndex
    pokemonList = when (sortListIndex) {
        1 -> pokemonList.sortedBy { it.numero }
        2 -> pokemonList.sortedByDescending { it.numero }
        3 -> pokemonList.sortedBy { it.nome }
        4 -> pokemonList.sortedByDescending { it.nome }
        else -> pokemonList
    }

    val initialPage = pokemonList.indexOfFirst { it.numero == pokemonNumber }
    val pagerState = rememberPagerState(initialPage = initialPage, pageCount = { pokemonList.size })

    PokedexTheme {
        Surface {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) { page ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    Column {
                        CardPokemon(pokemonList[page])
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun CardPokemonScreenPreview() {
    CardPokemonScreen(navController = null, pokemonNumber = "002", viewModel = null)
}

