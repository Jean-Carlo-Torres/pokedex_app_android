package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundFighter
import br.com.pokedex.ui.components.ElementFighterButton
import br.com.pokedex.ui.components.ElementFighterButtonSmall
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementGroundButton
import br.com.pokedex.ui.components.ElementMetalButton
import br.com.pokedex.ui.components.ElementMetalButtonSmall

val lucario = Pokemon(
    imagemPokemon = R.drawable.lucario,
    background = R.drawable.header_fighter,
    nome = "Lucario",
    numero = "448",
    descricao = "Ele controla ondas conhecidas como auras, que são poderosas o suficiente para pulverizar rochas enormes. Ele usa essas ondas para derrubar sua presa.",
    peso = 54.0,
    altura = 1.2,
    categoria = Categoria.AURA.descricao,
    habilidades = listOf("Inner Focus", "Steadfast").toTypedArray(),
    element = listOf(
        { ElementFighterButton() },
        { ElementMetalButton() }
    ),
    fraquezas = listOf(
        { ElementFireButton() },
        { ElementFighterButton() },
        { ElementGroundButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun LucarioData(): Pokemon {
    return Pokemon(
        imagemPokemon = lucario.imagemPokemon,
        background = lucario.background,
        nome = lucario.nome,
        numero = lucario.numero,
        descricao = lucario.descricao,
        peso = lucario.peso,
        altura = lucario.altura,
        categoria = lucario.categoria,
        habilidades = lucario.habilidades,
        element = lucario.element,
        fraquezas = lucario.fraquezas,
        evolucao = LucarioEvolution()
    )
}

@Composable
fun LucarioEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = lucario.imagemPokemon,
            nome = lucario.nome,
            numero = lucario.numero,
            element = listOf(
                { ElementFighterButtonSmall() },
                { ElementMetalButtonSmall() }
            ),
            background = BackgroundFighter(),
            elementTag = listOf(ElementTag.FIGHTING, ElementTag.METAL)
        )
    )
}

@Composable
fun LucarioListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = lucario.imagemPokemon,
        nome = lucario.nome,
        numero = lucario.numero,
        element = lucario.element,
        background = BackgroundFighter(),
        elementTag = listOf(ElementTag.FIGHTING, ElementTag.METAL)
    )
}