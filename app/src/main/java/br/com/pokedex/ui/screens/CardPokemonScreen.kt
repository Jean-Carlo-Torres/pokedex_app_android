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
import br.com.pokedex.ui.components.CardPokemon
import br.com.pokedex.ui.components.cards.BeedrillData
import br.com.pokedex.ui.components.cards.BlastoiseData
import br.com.pokedex.ui.components.cards.BulbasaurData
import br.com.pokedex.ui.components.cards.CharizardData
import br.com.pokedex.ui.components.cards.CharmanderData
import br.com.pokedex.ui.components.cards.CharmeleonData
import br.com.pokedex.ui.components.cards.CleifairyData
import br.com.pokedex.ui.components.cards.DugtrioData
import br.com.pokedex.ui.components.cards.IvysaurData
import br.com.pokedex.ui.components.cards.KoffingData
import br.com.pokedex.ui.components.cards.LickitungData
import br.com.pokedex.ui.components.cards.MewData
import br.com.pokedex.ui.components.cards.OnixData
import br.com.pokedex.ui.components.cards.PikachuData
import br.com.pokedex.ui.components.cards.SquirtleData
import br.com.pokedex.ui.components.cards.VenusaurData
import br.com.pokedex.ui.components.cards.WartortleData
import br.com.pokedex.ui.theme.PokedexTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardPokemonScreen(navController: NavController?, initialPage: Int) {
    val pokemonList = listOf(
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

//    val pagerState = rememberPagerState(pageCount = { pokemonList.size })
    val pagerState = rememberPagerState(initialPage = initialPage, pageCount = { pokemonList.size })

    PokedexTheme {
        Surface {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxSize()
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
//    CardPokemonScreen(navController = null)
}

