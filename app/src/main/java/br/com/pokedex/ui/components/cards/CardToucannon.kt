package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundFlying
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementFlyingButtonSmall
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementRockButton

val toucannon = Pokemon(
    imagemPokemon = R.drawable.toucannon,
    background = R.drawable.header_flying,
    nome = "Toucannon",
    numero = "733",
    descricao = "Eles batem bicos com outros de sua espécie para se comunicar. A força e o número de acertos dizem uns aos outros como eles se sentem.",
    peso = 26.0,
    altura = 1.1,
    categoria = Categoria.CANNON.descricao,
    habilidades = listOf("Keen Eye", "Skill Link").toTypedArray(),
    element = listOf { ElementFlyingButton() },
    fraquezas = listOf(
        { ElementElectricButton() },
        { ElementIceButton() },
        { ElementRockButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun ToucannonData(): Pokemon {
    return Pokemon(
        imagemPokemon = toucannon.imagemPokemon,
        background = toucannon.background,
        nome = toucannon.nome,
        numero = toucannon.numero,
        descricao = toucannon.descricao,
        peso = toucannon.peso,
        altura = toucannon.altura,
        categoria = toucannon.categoria,
        habilidades = toucannon.habilidades,
        element = toucannon.element,
        fraquezas = toucannon.fraquezas,
        evolucao = ToucannonEvolution()
    )
}

@Composable
fun ToucannonEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = toucannon.imagemPokemon,
            nome = toucannon.nome,
            numero = toucannon.numero,
            element = listOf { ElementFlyingButtonSmall() },
            background = BackgroundFlying(),
            elementTag = listOf(ElementTag.FLYING)
        )
    )
}

@Composable
fun ToucannonListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = toucannon.imagemPokemon,
        nome = toucannon.nome,
        numero = toucannon.numero,
        element = toucannon.element,
        background = BackgroundFlying(),
        elementTag = listOf(ElementTag.FLYING)
    )
}