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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.CardPokemon
import br.com.pokedex.ui.theme.PokedexTheme


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardPokemonScreen() {
    val pokemonList = listOf(
        Pokemon(
            imagemPokemon = painterResource(R.drawable.bulbasaur),
            background = painterResource(id = R.drawable.header_grass),
            nome = "Bulbasaur",
            numero = "001",
            descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
            peso = 6.9,
            altura = 0.7,
            categoria = Categoria.SEED,
            habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray()
        ),
        Pokemon(
            imagemPokemon = painterResource(id = R.drawable.ivysaur),
            background = painterResource(id = R.drawable.header_grass),
            nome = "Bulbasaur",
            numero = "001",
            descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
            peso = 6.9,
            altura = 0.7,
            categoria = Categoria.SEED,
            habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray()
        ),
        Pokemon(
            imagemPokemon = painterResource(id = R.drawable.venusaur),
            background = painterResource(id = R.drawable.header_grass),
            nome = "Bulbasaur",
            numero = "001",
            descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
            peso = 6.9,
            altura = 0.7,
            categoria = Categoria.SEED,
            habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray()
        ),
        // Adicione mais Pokémons conforme necessário
    )

    val pagerState = rememberPagerState(pageCount = { pokemonList.size })

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
private fun teste() {
    CardPokemonScreen()
}
