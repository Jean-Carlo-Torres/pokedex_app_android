package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundWater
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementWaterButton
import br.com.pokedex.ui.components.ElementWaterButtonSmall

val suicune = Pokemon(
    imagemPokemon = R.drawable.suicune,
    background = R.drawable.header_water,
    nome = "Suicune",
    numero = "245",
    descricao = "Suicune encarna a compaixão de uma fonte de água pura. Ele atravessa a terra com graciosidade.",
    peso = 187.0,
    altura = 2.0,
    categoria = Categoria.AURORA.descricao,
    habilidades = listOf("Pressure").toTypedArray(),
    element = listOf { ElementWaterButton() },
    fraquezas = listOf(
        { ElementGrassButton()},
        { ElementElectricButton()}
    ),
    evolucao = emptyList()
)

@Composable
fun SuicuneData(): Pokemon {
    return Pokemon(
        imagemPokemon = suicune.imagemPokemon,
        background = suicune.background,
        nome = suicune.nome,
        numero = suicune.numero,
        descricao = suicune.descricao,
        peso = suicune.peso,
        altura = suicune.altura,
        categoria = suicune.categoria,
        habilidades = suicune.habilidades,
        element = suicune.element,
        fraquezas = suicune.fraquezas,
        evolucao = SuicuneEvolution()
    )
}

@Composable
fun SuicuneEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = suicune.imagemPokemon,
            nome = suicune.nome,
            numero = suicune.numero,
            element = listOf { ElementWaterButtonSmall() },
            background = BackgroundWater(),
            elementTag = listOf(ElementTag.WATER)
        )
    )
}

@Composable
fun SuicuneListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = suicune.imagemPokemon,
        nome = suicune.nome,
        numero = suicune.numero,
        element = suicune.element,
        background = BackgroundWater(),
        elementTag = listOf(ElementTag.WATER)
    )
}