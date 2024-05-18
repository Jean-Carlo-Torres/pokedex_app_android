package br.com.pokedex.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pokedex.ui.components.CardPokemon
import br.com.pokedex.ui.components.cards.*
import br.com.pokedex.ui.theme.PokedexTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardPokemonScreen() {
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
        // Adicione mais Pokémons conforme necessário
    )

    val pagerState = rememberPagerState(pageCount = { pokemonList.size })

    PokedexTheme {
        Surface {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 32.dp)
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
    CardPokemonScreen()
}

