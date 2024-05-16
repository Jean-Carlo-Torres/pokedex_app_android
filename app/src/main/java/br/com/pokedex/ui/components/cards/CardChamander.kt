package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.ui.components.BackgroundFire
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFireButtonSmall
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementFlyingButtonSmall
import br.com.pokedex.ui.components.ElementStoneButton
import br.com.pokedex.ui.components.ElementTerrestrialButton
import br.com.pokedex.ui.components.ElementWaterButton

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
            { ElementStoneButton() }),
        evolucao = chamanderEvolution()
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
            { ElementStoneButton() }),
        evolucao = chamanderEvolution()
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
            { ElementStoneButton() }),
        evolucao = chamanderEvolution()
    )
}

@Composable
fun chamanderEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            nome = "Chamander",
            numero = "004",
            imagemPokemon = painterResource(R.drawable.charmander),
            background = BackgroundFire(),
            element = listOf { ElementFireButtonSmall() }
        ),
        PokemonListaItem(
            nome = "Charmeleon",
            numero = "005",
            imagemPokemon = painterResource(R.drawable.charmeleon),
            background = BackgroundFire(),
            element = listOf { ElementFireButtonSmall() }
        ),
        PokemonListaItem(
            nome = "Charizard",
            numero = "006",
            imagemPokemon = painterResource(R.drawable.charizard),
            background = BackgroundFire(),
            element = listOf(
                { ElementFireButtonSmall() },
                { ElementFlyingButtonSmall() }
            )
        )
    )
}
