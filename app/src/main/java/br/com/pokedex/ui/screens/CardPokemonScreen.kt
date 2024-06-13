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
import br.com.pokedex.model.UserViewModel
import br.com.pokedex.ui.components.CardPokemon
import br.com.pokedex.ui.components.cards.*
import br.com.pokedex.ui.theme.PokedexTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardPokemonScreen(
    navController: NavController?,
    pokemonNumber: String,
    pokemonViewModel: PokemonViewModel?,
    userViewModel: UserViewModel?
) {
    var pokemonListCard = listOf(
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
        MewData(),
        SuicuneData(),
        AggronData(),
        RayquazaData(),
        LucarioData(),
        SerperiorData(),
        ZoroarkData(),
        ChandelureData(),
        CubchooData(),
        ToucannonData(),
    )

    val sortListIndex = pokemonViewModel?.sortedListIndex
    pokemonListCard = when (sortListIndex) {
        1 -> pokemonListCard.sortedBy { it.numero }
        2 -> pokemonListCard.sortedByDescending { it.numero }
        3 -> pokemonListCard.sortedBy { it.nome }
        4 -> pokemonListCard.sortedByDescending { it.nome }
        else -> pokemonListCard
    }

    val initialPage = pokemonListCard.indexOfFirst { it.numero == pokemonNumber }
    val pagerState =
        rememberPagerState(initialPage = initialPage, pageCount = { pokemonListCard.size })

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
                        CardPokemon(pokemonListCard[page], userViewModel, navController)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun CardPokemonScreenPreview() {
    CardPokemonScreen(
        navController = null,
        pokemonNumber = "002",
        pokemonViewModel = null,
        userViewModel = null
    )
}

