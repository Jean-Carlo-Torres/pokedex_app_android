package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundGhost
import br.com.pokedex.ui.components.ElementDarkButton
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementGhostButton
import br.com.pokedex.ui.components.ElementGhostButtonSmall
import br.com.pokedex.ui.components.ElementGroundButton
import br.com.pokedex.ui.components.ElementRockButton
import br.com.pokedex.ui.components.ElementWaterButton

val chandelure = Pokemon(
    imagemPokemon = R.drawable.chandelure,
    background = R.drawable.header_ghost,
    nome = "Chandelure",
    numero = "609",
    descricao = "Este Pokémon assombra mansões em ruínas. Ele balança seus braços para hipnotizar os oponentes com a dança sinistra de suas chamas.",
    peso = 34.3,
    altura = 1.0,
    categoria = Categoria.LURING.descricao,
    habilidades = listOf("Flash FIre", "Flame Body").toTypedArray(),
    element = listOf(
        { ElementGhostButton() },
        { ElementFireButton() }
    ),
    fraquezas = listOf(
        { ElementGhostButton() },
        { ElementDarkButton() },
        { ElementGroundButton() },
        { ElementWaterButton() },
        { ElementRockButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun ChandelureData(): Pokemon {
    return Pokemon(
        imagemPokemon = chandelure.imagemPokemon,
        background = chandelure.background,
        nome = chandelure.nome,
        numero = chandelure.numero,
        descricao = chandelure.descricao,
        peso = chandelure.peso,
        altura = chandelure.altura,
        categoria = chandelure.categoria,
        habilidades = chandelure.habilidades,
        element = chandelure.element,
        fraquezas = chandelure.fraquezas,
        evolucao = ChandelureEvolution()
    )
}

@Composable
fun ChandelureEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = chandelure.imagemPokemon,
            nome = chandelure.nome,
            numero = chandelure.numero,
            element = listOf { ElementGhostButtonSmall() },
            background = BackgroundGhost(),
            elementTag = listOf(ElementTag.GHOST)
        )
    )
}

@Composable
fun ChandelureListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = chandelure.imagemPokemon,
        nome = chandelure.nome,
        numero = chandelure.numero,
        element = chandelure.element,
        background = BackgroundGhost(),
        elementTag = listOf(ElementTag.GHOST)
    )
}