package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundDark
import br.com.pokedex.ui.components.ElementBugButton
import br.com.pokedex.ui.components.ElementDarkButton
import br.com.pokedex.ui.components.ElementDarkButtonSmall
import br.com.pokedex.ui.components.ElementFairyButtom
import br.com.pokedex.ui.components.ElementFighterButton

val zoroark = Pokemon(
    imagemPokemon = R.drawable.zoroark,
    background = R.drawable.header_dark,
    nome = "Zoroark",
    numero = "571",
    descricao = "Este Pokémon se preocupa profundamente com outros de sua espécie e conjurará ilusões aterrorizantes para manter sua toca e sua mochila seguras.",
    peso = 81.1,
    altura = 1.6,
    categoria = Categoria.ILLUSION_FOX.descricao,
    habilidades = listOf("Illusion").toTypedArray(),
    element = listOf { ElementDarkButton() },
    fraquezas = listOf(
        { ElementFairyButtom() },
        { ElementBugButton() },
        { ElementFighterButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun ZoroarkData(): Pokemon {
    return Pokemon(
        imagemPokemon = zoroark.imagemPokemon,
        background = zoroark.background,
        nome = zoroark.nome,
        numero = zoroark.numero,
        descricao = zoroark.descricao,
        peso = zoroark.peso,
        altura = zoroark.altura,
        categoria = zoroark.categoria,
        habilidades = zoroark.habilidades,
        element = zoroark.element,
        fraquezas = zoroark.fraquezas,
        evolucao = ZoroarkEvolution()
    )
}

@Composable
fun ZoroarkEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = zoroark.imagemPokemon,
            nome = zoroark.nome,
            numero = zoroark.numero,
            element = listOf { ElementDarkButtonSmall() },
            background = BackgroundDark(),
            elementTag = listOf(ElementTag.DARK)
        )
    )
}

@Composable
fun ZoroarkListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = zoroark.imagemPokemon,
        nome = zoroark.nome,
        numero = zoroark.numero,
        element = zoroark.element,
        background = BackgroundDark(),
        elementTag = listOf(ElementTag.DARK)
    )
}