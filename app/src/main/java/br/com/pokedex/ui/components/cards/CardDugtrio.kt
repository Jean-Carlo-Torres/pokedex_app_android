package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundTerrestrial
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementGroundButton
import br.com.pokedex.ui.components.ElementGroundButtonSmall
import br.com.pokedex.ui.components.ElementWaterButton

val dugtrio = Pokemon(
    imagemPokemon = R.drawable.dugtrio,
    background = R.drawable.header_ground,
    nome = "Dugtrio",
    numero = "051",
    descricao = "Uma equipe de trigêmeos Diglett. Ele desencadeia enormes terremotos cavando 60 milhas no subsolo.",
    peso = 33.3,
    altura = 0.7,
    categoria = Categoria.DIGGER.descricao,
    habilidades = listOf("Sand Veil", "Arena Trap").toTypedArray(),
    element = listOf { ElementGroundButton() },
    fraquezas = listOf(
        { ElementWaterButton() },
        { ElementGrassButton() },
        { ElementIceButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun DugtrioData(): Pokemon {
    return Pokemon(
        imagemPokemon = dugtrio.imagemPokemon,
        background = dugtrio.background,
        nome = dugtrio.nome,
        numero = dugtrio.numero,
        descricao = dugtrio.descricao,
        peso = dugtrio.peso,
        altura = dugtrio.altura,
        categoria = dugtrio.categoria,
        habilidades = dugtrio.habilidades,
        element = dugtrio.element,
        fraquezas = dugtrio.fraquezas,
        evolucao = DugtrioEvolution()
    )
}

@Composable
fun DugtrioEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = dugtrio.imagemPokemon,
            nome = dugtrio.nome,
            numero = dugtrio.numero,
            element = listOf { ElementGroundButtonSmall() },
            background = BackgroundTerrestrial(),
            elementTag = listOf(ElementTag.GROUND)
        )
    )
}

@Composable
fun DugtrioListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = dugtrio.imagemPokemon,
        nome = dugtrio.nome,
        numero = dugtrio.numero,
        element = dugtrio.element,
        background = BackgroundTerrestrial(),
        elementTag = listOf(ElementTag.GROUND)
    )
}