package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundPsychic
import br.com.pokedex.ui.components.ElementGhostButton
import br.com.pokedex.ui.components.ElementBugButton
import br.com.pokedex.ui.components.ElementDarkButton
import br.com.pokedex.ui.components.ElementPsychicButton
import br.com.pokedex.ui.components.ElementPsychicButtonSmall

val mew = Pokemon(
    imagemPokemon = R.drawable.mew,
    background = R.drawable.header_psychic,
    nome = "Mew",
    numero = "151",
    descricao = "Quando visto através de um microscópio, o cabelo curto, fino e delicado deste Pokémon pode ser visto.\n",
    peso = 4.0,
    altura = 0.4,
    categoria = Categoria.PSYCHIC,
    habilidades = listOf("Synchronize").toTypedArray(),
    element = listOf { ElementPsychicButton() },
    fraquezas = listOf(
        { ElementGhostButton() },
        { ElementDarkButton() },
        { ElementBugButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun MewData(): Pokemon {
    return Pokemon(
        imagemPokemon = mew.imagemPokemon,
        background = mew.background,
        nome = mew.nome,
        numero = mew.numero,
        descricao = mew.descricao,
        peso = mew.peso,
        altura = mew.altura,
        categoria = mew.categoria,
        habilidades = mew.habilidades,
        element = mew.element,
        fraquezas = mew.fraquezas,
        evolucao = MewEvolution()
    )
}

@Composable
fun MewEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = mew.imagemPokemon,
            nome = mew.nome,
            numero = mew.numero,
            background = BackgroundPsychic(),
            element = listOf { ElementPsychicButtonSmall() },
            elementTag = listOf(ElementTag.PSYCHIC)
        )
    )
}

@Composable
fun MewListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = mew.imagemPokemon,
        nome = mew.nome,
        numero = mew.numero,
        element = mew.element,
        background = BackgroundPsychic(),
        elementTag = listOf(ElementTag.PSYCHIC)
    )
}