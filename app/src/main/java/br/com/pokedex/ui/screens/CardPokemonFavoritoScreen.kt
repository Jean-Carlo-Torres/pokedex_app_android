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
import br.com.pokedex.model.UserViewModel
import br.com.pokedex.ui.components.CardPokemon
import br.com.pokedex.ui.components.cards.AggronData
import br.com.pokedex.ui.components.cards.BeedrillData
import br.com.pokedex.ui.components.cards.BlastoiseData
import br.com.pokedex.ui.components.cards.BulbasaurData
import br.com.pokedex.ui.components.cards.ChandelureData
import br.com.pokedex.ui.components.cards.CharizardData
import br.com.pokedex.ui.components.cards.CharmanderData
import br.com.pokedex.ui.components.cards.CharmeleonData
import br.com.pokedex.ui.components.cards.CleifairyData
import br.com.pokedex.ui.components.cards.CubchooData
import br.com.pokedex.ui.components.cards.DugtrioData
import br.com.pokedex.ui.components.cards.IvysaurData
import br.com.pokedex.ui.components.cards.KoffingData
import br.com.pokedex.ui.components.cards.LickitungData
import br.com.pokedex.ui.components.cards.LucarioData
import br.com.pokedex.ui.components.cards.MewData
import br.com.pokedex.ui.components.cards.OnixData
import br.com.pokedex.ui.components.cards.PikachuData
import br.com.pokedex.ui.components.cards.RayquazaData
import br.com.pokedex.ui.components.cards.SerperiorData
import br.com.pokedex.ui.components.cards.SquirtleData
import br.com.pokedex.ui.components.cards.SuicuneData
import br.com.pokedex.ui.components.cards.ToucannonData
import br.com.pokedex.ui.components.cards.VenusaurData
import br.com.pokedex.ui.components.cards.WartortleData
import br.com.pokedex.ui.components.cards.ZoroarkData
import br.com.pokedex.ui.theme.PokedexTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardPokemonFavoritoScreen(
    navController: NavController?,
    pokemonNumber: String,
    userViewModel: UserViewModel?
) {
    val favoritePokemons = userViewModel?.user?.pokemonsFavoritos
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
    ).filter {
        favoritePokemons?.contains(it.nome) ?: false
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