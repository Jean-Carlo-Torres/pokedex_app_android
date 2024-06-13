package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundElectric
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementElectricButtonSmall
import br.com.pokedex.ui.components.ElementGroundButton

val pikachu = Pokemon(
    imagemPokemon = R.drawable.pikachu,
    background = R.drawable.header_electric,
    nome = "Pikachu",
    numero = "025",
    descricao = "Pikachu, que pode gerar uma eletricidade poderosa, tem bolsas nas bochechas que são extra macias e super elásticas.",
    peso = 6.0,
    altura = 0.4,
    categoria = Categoria.MOUSE.descricao,
    habilidades = listOf("Static").toTypedArray(),
    element = listOf { ElementElectricButton() },
    fraquezas = listOf { ElementGroundButton() },
    evolucao = emptyList()
)

@Composable
fun PikachuData(): Pokemon {
    return Pokemon(
        imagemPokemon = pikachu.imagemPokemon,
        background = pikachu.background,
        nome = pikachu.nome,
        numero = pikachu.numero,
        descricao = pikachu.descricao,
        peso = pikachu.peso,
        altura = pikachu.altura,
        categoria = pikachu.categoria,
        habilidades = pikachu.habilidades,
        element = pikachu.element,
        fraquezas = pikachu.fraquezas,
        evolucao = PikachuEvolution()
    )
}

@Composable
fun PikachuEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = pikachu.imagemPokemon,
            nome = pikachu.nome,
            numero = pikachu.numero,
            element = listOf { ElementElectricButtonSmall() },
            background = BackgroundElectric(),
            elementTag = listOf(ElementTag.ELECTRIC)
        )
    )
}

@Composable
fun PikachuListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = pikachu.imagemPokemon,
        nome = pikachu.nome,
        numero = pikachu.numero,
        element = pikachu.element,
        background = BackgroundElectric(),
        elementTag = listOf(ElementTag.ELECTRIC)
    )
}