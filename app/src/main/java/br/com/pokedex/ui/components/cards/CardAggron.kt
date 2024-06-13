package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundMetal
import br.com.pokedex.ui.components.ElementFighterButton
import br.com.pokedex.ui.components.ElementGroundButton
import br.com.pokedex.ui.components.ElementMetalButton
import br.com.pokedex.ui.components.ElementMetalButtonSmall
import br.com.pokedex.ui.components.ElementRockButton
import br.com.pokedex.ui.components.ElementWaterButton

val aggron = Pokemon(
    imagemPokemon = R.drawable.aggron,
    background = R.drawable.header_metal,
    nome = "Aggron",
    numero = "306",
    descricao = "Aggron tem um chifre afiado o suficiente para perfurar grossas chapas de ferro. Ele derruba seus oponentes batendo neles primeiro com o chifre.",
    peso = 360.0,
    altura = 2.1,
    categoria = Categoria.IRON_ARMOR.descricao,
    habilidades = listOf("Rock Head", "Sturdy").toTypedArray(),
    element = listOf(
        { ElementMetalButton() },
        { ElementRockButton() }
    ),
    fraquezas = listOf(
        { ElementWaterButton() },
        { ElementFighterButton() },
        { ElementGroundButton()}
    ),
    evolucao = emptyList()
)

@Composable
fun AggronData(): Pokemon {
    return Pokemon(
        imagemPokemon = aggron.imagemPokemon,
        background = aggron.background,
        nome = aggron.nome,
        numero = aggron.numero,
        descricao = aggron.descricao,
        peso = aggron.peso,
        altura = aggron.altura,
        categoria = aggron.categoria,
        habilidades = aggron.habilidades,
        element = aggron.element,
        fraquezas = aggron.fraquezas,
        evolucao = AggronEvolution()
    )
}

@Composable
fun AggronEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = aggron.imagemPokemon,
            nome = aggron.nome,
            numero = aggron.numero,
            element = listOf { ElementMetalButtonSmall() },
            background = BackgroundMetal(),
            elementTag = listOf(ElementTag.METAL)
        )
    )
}

@Composable
fun AggronListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = aggron.imagemPokemon,
        nome = aggron.nome,
        numero = aggron.numero,
        element = aggron.element,
        background = BackgroundMetal(),
        elementTag = listOf(ElementTag.METAL)
    )
}