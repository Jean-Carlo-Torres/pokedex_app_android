package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundStone
import br.com.pokedex.ui.components.ElementFighterButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementMetalButton
import br.com.pokedex.ui.components.ElementRockButton
import br.com.pokedex.ui.components.ElementRockButtonSmall
import br.com.pokedex.ui.components.ElementGroundButton
import br.com.pokedex.ui.components.ElementGroundButtonSmall
import br.com.pokedex.ui.components.ElementWaterButton

val onix = Pokemon(
    imagemPokemon = R.drawable.onix,
    background = R.drawable.header_rock,
    nome = "Onix",
    numero = "095",
    descricao = "À medida que escava o solo, absorve muitos objetos duros. Isso é o que torna seu corpo tão sólido.",
    peso = 210.0,
    altura = 8.8,
    categoria = Categoria.ROCK,
    habilidades = listOf("Rock Head", "Sturdy").toTypedArray(),
    element = listOf(
        { ElementRockButton() },
        { ElementGroundButton() }
    ),
    fraquezas = listOf(
        { ElementMetalButton() },
        { ElementFighterButton() },
        { ElementWaterButton() },
        { ElementIceButton() },
        { ElementGrassButton() },
        { ElementGroundButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun OnixData(): Pokemon {
    return Pokemon(
        imagemPokemon = onix.imagemPokemon,
        background = onix.background,
        nome = onix.nome,
        numero = onix.numero,
        descricao = onix.descricao,
        peso = onix.peso,
        altura = onix.altura,
        categoria = onix.categoria,
        habilidades = onix.habilidades,
        element = onix.element,
        fraquezas = onix.fraquezas,
        evolucao = OnixEvolution()
    )
}

@Composable
fun OnixEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = onix.imagemPokemon,
            nome = onix.nome,
            numero = onix.numero,
            element = listOf(
                { ElementRockButtonSmall() },
                { ElementGroundButtonSmall() },
            ),
            background = BackgroundStone(),
            elementTag = listOf(ElementTag.ROCK)
        )
    )
}

@Composable
fun OnixListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = onix.imagemPokemon,
        nome = onix.nome,
        numero = onix.numero,
        element = onix.element,
        background = BackgroundStone(),
        elementTag = listOf(ElementTag.ROCK)
    )
}