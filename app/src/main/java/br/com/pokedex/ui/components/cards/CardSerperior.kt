package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundGrass
import br.com.pokedex.ui.components.ElementBugButton
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementGrassButtonSmall
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementPoisonButton

val serperior = Pokemon(
    imagemPokemon = R.drawable.serperior,
    background = R.drawable.header_grass,
    nome = "Serperior",
    numero = "497",
    descricao = "Ele só dá tudo de si contra oponentes fortes que não se incomodam com o brilho dos olhos nobres de Serperior.",
    peso = 60.3,
    altura = 3.3,
    categoria = Categoria.REGAL.descricao,
    habilidades = listOf("Overgrow").toTypedArray(),
    element = listOf { ElementGrassButton() },
    fraquezas = listOf(
        { ElementFireButton() },
        { ElementFlyingButton() },
        { ElementIceButton() },
        { ElementPoisonButton() },
        { ElementBugButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun SerperiorData(): Pokemon {
    return Pokemon(
        imagemPokemon = serperior.imagemPokemon,
        background = serperior.background,
        nome = serperior.nome,
        numero = serperior.numero,
        descricao = serperior.descricao,
        peso = serperior.peso,
        altura = serperior.altura,
        categoria = serperior.categoria,
        habilidades = serperior.habilidades,
        element = serperior.element,
        fraquezas = serperior.fraquezas,
        evolucao = SerperiorEvolution()
    )
}

@Composable
fun SerperiorEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = serperior.imagemPokemon,
            nome = serperior.nome,
            numero = serperior.numero,
            element = listOf { ElementGrassButtonSmall() },
            background = BackgroundGrass(),
            elementTag = listOf(ElementTag.GRASS)
        )
    )
}

@Composable
fun SerperiorListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = serperior.imagemPokemon,
        nome = serperior.nome,
        numero = serperior.numero,
        element = serperior.element,
        background = BackgroundGrass(),
        elementTag = listOf(ElementTag.GRASS)
    )
}