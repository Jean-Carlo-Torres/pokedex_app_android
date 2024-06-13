package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundPoison
import br.com.pokedex.ui.components.ElementPoisonButton
import br.com.pokedex.ui.components.ElementPoisonButtonSmall
import br.com.pokedex.ui.components.ElementPsychicButton
import br.com.pokedex.ui.components.ElementGroundButton

val koffing = Pokemon(
    imagemPokemon = R.drawable.koffing,
    background = R.drawable.header_poison,
    nome = "Koffing",
    numero = "109",
    descricao = "Seu corpo está cheio de gás venenoso. Ele flutua em lixões, procurando a fumaça do lixo cru e apodrecido.\n",
    peso = 1.0,
    altura = 0.6,
    categoria = Categoria.POISON.descricao,
    habilidades = listOf("Levitate", "Neutralizing").toTypedArray(),
    element = listOf { ElementPoisonButton() },
    fraquezas = listOf(
        { ElementPsychicButton() },
        { ElementGroundButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun KoffingData(): Pokemon {
    return Pokemon(
        imagemPokemon = koffing.imagemPokemon,
        background = koffing.background,
        nome = koffing.nome,
        numero = koffing.numero,
        descricao = koffing.descricao,
        peso = koffing.peso,
        altura = koffing.altura,
        categoria = koffing.categoria,
        habilidades = koffing.habilidades,
        element = koffing.element,
        fraquezas = koffing.fraquezas,
        evolucao = KoffingEvolution()
    )
}

@Composable
fun KoffingEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = koffing.imagemPokemon,
            nome = koffing.nome,
            numero = koffing.numero,
            background = BackgroundPoison(),
            element = listOf { ElementPoisonButtonSmall() },
            elementTag = listOf(ElementTag.POISON)
        )
    )
}

@Composable
fun KoffingListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = koffing.imagemPokemon,
        nome = koffing.nome,
        numero = koffing.numero,
        element = koffing.element,
        background = BackgroundPoison(),
        elementTag = listOf(ElementTag.POISON)
    )
}