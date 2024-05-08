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
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementPoisonButton
import br.com.pokedex.ui.components.ElementPsychicButton
import br.com.pokedex.ui.components.ElementStoneButton
import br.com.pokedex.ui.components.ElementTerrestrialButton
import br.com.pokedex.ui.components.ElementWaterButton
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

@Composable
fun BulbasaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.bulbasaur),
        background = painterResource(id = R.drawable.header_grass),
        nome = "Bulbasaur",
        numero = "001",
        descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
        peso = 6.9,
        altura = 0.7,
        categoria = Categoria.SEED,
        habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray(),
        element = listOf(
            { ElementGrassButton() },
            { ElementPoisonButton() }
        ),
        fraquezas = listOf(
            { ElementFireButton() },
            { ElementPsychicButton() },
            { ElementFlyingButton() },
            { ElementIceButton() }
        )
    )
}

@Composable
fun IvysaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.ivysaur),
        background = painterResource(id = R.drawable.header_grass),
        nome = "Ivysaur",
        numero = "002",
        descricao = "Quando o bulbo nas costas cresce, parece perder a capacidade de ficar em pé nas patas traseiras.\n",
        peso = 13.0,
        altura = 1.0,
        categoria = Categoria.SEED,
        habilidades = listOf("Overgrow").toTypedArray(),
        element = listOf(
            { ElementGrassButton() },
            { ElementPoisonButton() }
        ),
        fraquezas = listOf(
            { ElementFireButton() },
            { ElementPsychicButton() },
            { ElementFlyingButton() },
            { ElementIceButton() }
        )
    )
}

@Composable
fun VenusaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.venusaur),
        background = painterResource(id = R.drawable.header_grass),
        nome = "Venusaur",
        numero = "003",
        descricao = "Sua planta floresce quando está absorvendo energia solar. Ele permanece em movimento para buscar a luz do sol.\n",
        peso = 100.0,
        altura = 2.0,
        categoria = Categoria.SEED,
        habilidades = listOf("Overgrow").toTypedArray(),
        element = listOf(
            { ElementGrassButton() },
            { ElementPoisonButton() }
        ),
        fraquezas = listOf(
            { ElementFireButton() },
            { ElementPsychicButton() },
            { ElementFlyingButton() },
            { ElementIceButton() }
        )
    )
}

@Composable
fun CharmanderData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.charmander),
        background = painterResource(id = R.drawable.header_fire),
        nome = "Charmander",
        numero = "004",
        descricao = "Tem preferência por coisas quentes. Quando chove, diz-se que o vapor jorra da ponta de sua cauda.\n",
        peso = 8.5,
        altura = 0.6,
        categoria = Categoria.LIZARD,
        habilidades = listOf("Blaze").toTypedArray(),
        element = listOf { ElementFireButton() },
        fraquezas = listOf(
            { ElementWaterButton() },
            { ElementTerrestrialButton() },
            { ElementStoneButton() })
    )
}

@Composable
fun CharmeleonData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.charmeleon),
        background = painterResource(id = R.drawable.header_fire),
        nome = "Charmeleon",
        numero = "005",
        descricao = "Tem uma natureza bárbara. Na batalha, ele chicoteia sua cauda de fogo e corta com garras afiadas.\n",
        peso = 19.0,
        altura = 1.1,
        categoria = Categoria.FRAME,
        habilidades = listOf("Blaze").toTypedArray(),
        element = listOf { ElementFireButton() },
        fraquezas = listOf(
            { ElementWaterButton() },
            { ElementTerrestrialButton() },
            { ElementStoneButton() })
    )
}

@Composable
fun CharizardData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.charizard),
        background = painterResource(id = R.drawable.header_fire),
        nome = "Charizard",
        numero = "006",
        descricao = "Ele cospe fogo que é quente o suficiente para derreter pedregulhos. Pode causar incêndios florestais soprando chamas.",
        peso = 90.5,
        altura = 1.7,
        categoria = Categoria.FRAME,
        habilidades = listOf("Blaze").toTypedArray(),
        element = listOf(
            { ElementFireButton() },
            { ElementFlyingButton() }
        ),
        fraquezas = listOf(
            { ElementWaterButton() },
            { ElementElectricButton() },
            { ElementStoneButton() })
    )
}

@Preview
@Composable
private fun CardPokemonScreenPreview() {
    CardPokemonScreen()
}

