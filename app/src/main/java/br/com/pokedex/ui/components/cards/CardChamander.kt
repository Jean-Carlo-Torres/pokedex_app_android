package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.ui.components.BackgroundFire
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFireButtonSmall
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementFlyingButtonSmall
import br.com.pokedex.ui.components.ElementRockButton
import br.com.pokedex.ui.components.ElementGroundButton
import br.com.pokedex.ui.components.ElementWaterButton

val charmander = Pokemon(
    imagemPokemon = R.drawable.charmander,
    background = R.drawable.header_fire,
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
        { ElementGroundButton() },
        { ElementRockButton() }),
    evolucao = emptyList()
)

val charmeleon = Pokemon(
    imagemPokemon = R.drawable.charmeleon,
    background = R.drawable.header_fire,
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
        { ElementGroundButton() },
        { ElementRockButton() }),
    evolucao = emptyList()
)

val charizard = Pokemon(
    imagemPokemon = R.drawable.charizard,
    background = R.drawable.header_fire,
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
        { ElementRockButton() }),
    evolucao = emptyList()
)

@Composable
fun CharmanderData(): Pokemon {
    return Pokemon(
        imagemPokemon = charmander.imagemPokemon,
        background = charmander.background,
        nome = charmander.nome,
        numero = charmander.numero,
        descricao = charmander.descricao,
        peso = charmander.peso,
        altura = charmander.altura,
        categoria = charmander.categoria,
        habilidades = charmander.habilidades,
        element = charmander.element,
        fraquezas = charmander.fraquezas,
        evolucao = chamanderEvolution()
    )
}

@Composable
fun CharmeleonData(): Pokemon {
    return Pokemon(
        imagemPokemon = charmeleon.imagemPokemon,
        background = charmeleon.background,
        nome = charmeleon.nome,
        numero = charmeleon.numero,
        descricao = charmeleon.descricao,
        peso = charmeleon.peso,
        altura = charmeleon.altura,
        categoria = charmeleon.categoria,
        habilidades = charmeleon.habilidades,
        element = charmeleon.element,
        fraquezas = charmeleon.fraquezas,
        evolucao = chamanderEvolution()
    )
}

@Composable
fun CharizardData(): Pokemon {
    return Pokemon(
        imagemPokemon = charizard.imagemPokemon,
        background = charizard.background,
        nome = charizard.nome,
        numero = charizard.numero,
        descricao = charizard.descricao,
        peso = charizard.peso,
        altura = charizard.altura,
        categoria = charizard.categoria,
        habilidades = charizard.habilidades,
        element = charizard.element,
        fraquezas = charizard.fraquezas,
        evolucao = chamanderEvolution()
    )
}

@Composable
fun chamanderEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            nome = charmander.nome,
            numero = charmander.numero,
            imagemPokemon = charmander.imagemPokemon,
            background = BackgroundFire(),
            element = listOf { ElementFireButtonSmall() },
            elementTag = listOf(ElementTag.FIRE)
        ),
        PokemonListaItem(
            nome = charmeleon.nome,
            numero = charmeleon.numero,
            imagemPokemon = charmeleon.imagemPokemon,
            background = BackgroundFire(),
            element = listOf { ElementFireButtonSmall() },
            elementTag = listOf(ElementTag.FIRE)
        ),
        PokemonListaItem(
            nome = charizard.nome,
            numero = charizard.numero,
            imagemPokemon = charizard.imagemPokemon,
            background = BackgroundFire(),
            element = listOf(
                { ElementFireButtonSmall() },
                { ElementFlyingButtonSmall() }
            ),
            elementTag = listOf(ElementTag.FIRE, ElementTag.FLYING)
        )
    )
}

@Composable
fun CharmanderListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = charmander.imagemPokemon,
        nome = charmander.nome,
        numero = charmander.numero,
        element = charmander.element,
        background = BackgroundFire(),
        elementTag = listOf(ElementTag.FIRE)
    )
}

@Composable
fun CharmeleonListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = charmeleon.imagemPokemon,
        nome = charmeleon.nome,
        numero = charmeleon.numero,
        element = charmeleon.element,
        background = BackgroundFire(),
        elementTag = listOf(ElementTag.FIRE)
    )
}

@Composable
fun CharizardListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = charizard.imagemPokemon,
        nome = charizard.nome,
        numero = charizard.numero,
        element = charizard.element,
        background = BackgroundFire(),
        elementTag = listOf(ElementTag.FIRE,  ElementTag.FLYING)
    )
}
