package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundInsect
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementBugButton
import br.com.pokedex.ui.components.ElementBugButtonSmall
import br.com.pokedex.ui.components.ElementPoisonButton
import br.com.pokedex.ui.components.ElementPoisonButtonSmall
import br.com.pokedex.ui.components.ElementPsychicButton
import br.com.pokedex.ui.components.ElementRockButton

val beedrill = Pokemon(
    imagemPokemon = R.drawable.beedrill,
    background = R.drawable.header_bug,
    nome = "Beedrill",
    numero = "015",
    descricao = "Tem três ferrões venenosos nas patas dianteiras e na cauda. Eles são usados para espetar seu inimigo repetidamente.",
    peso = 29.5,
    altura = 1.0,
    categoria = Categoria.POISON,
    habilidades = listOf("Swarm").toTypedArray(),
    element = listOf(
        { ElementBugButton() },
        { ElementPoisonButton() }
    ),
    fraquezas = listOf(
        { ElementFireButton() },
        { ElementPsychicButton() },
        { ElementFlyingButton() },
        { ElementRockButton() },
    ),
    evolucao = emptyList()
)

@Composable
fun BeedrillData(): Pokemon {
    return Pokemon(
        imagemPokemon = beedrill.imagemPokemon,
        background = beedrill.background,
        nome = beedrill.nome,
        numero = beedrill.numero,
        descricao = beedrill.descricao,
        peso = beedrill.peso,
        altura = beedrill.altura,
        categoria = beedrill.categoria,
        habilidades = beedrill.habilidades,
        element = beedrill.element,
        fraquezas = beedrill.fraquezas,
        evolucao = BeedrillEvolution()
    )
}

@Composable
fun BeedrillEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = beedrill.imagemPokemon,
            nome = beedrill.nome,
            numero = beedrill.numero,
            element = listOf(
                { ElementBugButtonSmall() },
                { ElementPoisonButtonSmall() }
            ),
            background = BackgroundInsect(),
            elementTag = listOf(ElementTag.BUG, ElementTag.POISON)
        )
    )
}

@Composable
fun BeedrillListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = beedrill.imagemPokemon,
        nome = beedrill.nome,
        numero = beedrill.numero,
        element = beedrill.element,
        background = BackgroundInsect(),
        elementTag = listOf(ElementTag.BUG, ElementTag.POISON)
    )
}