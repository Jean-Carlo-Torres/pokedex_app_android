package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundNormal
import br.com.pokedex.ui.components.ElementFighterButton
import br.com.pokedex.ui.components.ElementNormalButton
import br.com.pokedex.ui.components.ElementNormalButtonSmall

val lickitung = Pokemon(
    imagemPokemon = R.drawable.lickitung,
    background = R.drawable.header_normal,
    nome = "Lickitung",
    numero = "108",
    descricao = "Se a saliva pegajosa deste Pokémon entrar em contato com você e você não a limpar, uma coceira intensa se instalará. A coceira também não desaparecerá.\n",
    peso = 65.5,
    altura = 1.2,
    categoria = Categoria.LICKING.descricao,
    habilidades = listOf("Own Tempo", "Oblivious").toTypedArray(),
    element = listOf { ElementNormalButton() },
    fraquezas = listOf { ElementFighterButton() },
    evolucao = emptyList()
)

@Composable
fun LickitungData(): Pokemon {
    return Pokemon(
        imagemPokemon = lickitung.imagemPokemon,
        background = lickitung.background,
        nome = lickitung.nome,
        numero = lickitung.numero,
        descricao = lickitung.descricao,
        peso = lickitung.peso,
        altura = lickitung.altura,
        categoria = lickitung.categoria,
        habilidades = lickitung.habilidades,
        element = lickitung.element,
        fraquezas = lickitung.fraquezas,
        evolucao = LickitungEvolution()
    )
}

@Composable
fun LickitungEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = R.drawable.lickitung,
            nome = lickitung.nome,
            numero = lickitung.numero,
            element = listOf { ElementNormalButtonSmall() },
            background = BackgroundNormal(),
            elementTag = listOf(ElementTag.NORMAL)
        )
    )
}

@Composable
fun LickitungListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = lickitung.imagemPokemon,
        nome = lickitung.nome,
        numero = lickitung.numero,
        element = lickitung.element,
        background = BackgroundNormal(),
        elementTag = listOf(ElementTag.NORMAL)
    )
}