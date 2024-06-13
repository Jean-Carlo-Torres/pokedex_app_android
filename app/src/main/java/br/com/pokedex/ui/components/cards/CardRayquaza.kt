package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundDragon
import br.com.pokedex.ui.components.BackgroundMetal
import br.com.pokedex.ui.components.ElementDragonButton
import br.com.pokedex.ui.components.ElementDragonButtonSmall
import br.com.pokedex.ui.components.ElementFairyButtom
import br.com.pokedex.ui.components.ElementFighterButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementFlyingButtonSmall
import br.com.pokedex.ui.components.ElementGroundButton
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementMetalButton
import br.com.pokedex.ui.components.ElementMetalButtonSmall
import br.com.pokedex.ui.components.ElementRockButton
import br.com.pokedex.ui.components.ElementWaterButton

val rayquaza = Pokemon(
    imagemPokemon = R.drawable.rayquaza,
    background = R.drawable.header_dragon,
    nome = "Rayquara",
    numero = "384",
    descricao = "Diz-se que Rayquaza viveu por centenas de milhões de anos. Permanecem as lendas de como acabou o confronto entre Kyogre e Groudon.",
    peso = 206.5,
    altura = 7.0,
    categoria = Categoria.DRAGON.descricao,
    habilidades = listOf("Air Lock").toTypedArray(),
    element = listOf(
        { ElementDragonButton() },
        { ElementFlyingButton() }
    ),
    fraquezas = listOf(
        { ElementFairyButtom() },
        { ElementDragonButton() },
        { ElementIceButton() },
        { ElementRockButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun RayquazaData(): Pokemon {
    return Pokemon(
        imagemPokemon = rayquaza.imagemPokemon,
        background = rayquaza.background,
        nome = rayquaza.nome,
        numero = rayquaza.numero,
        descricao = rayquaza.descricao,
        peso = rayquaza.peso,
        altura = rayquaza.altura,
        categoria = rayquaza.categoria,
        habilidades = rayquaza.habilidades,
        element = rayquaza.element,
        fraquezas = rayquaza.fraquezas,
        evolucao = RayquazaEvolution()
    )
}

@Composable
fun RayquazaEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = rayquaza.imagemPokemon,
            nome = rayquaza.nome,
            numero = rayquaza.numero,
            element = listOf(
                { ElementDragonButtonSmall() },
                { ElementFlyingButtonSmall() }
            ),
            background = BackgroundDragon(),
            elementTag = listOf(ElementTag.DRAGON, ElementTag.FLYING)
        )
    )
}

@Composable
fun RayquazaListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = rayquaza.imagemPokemon,
        nome = rayquaza.nome,
        numero = rayquaza.numero,
        element = rayquaza.element,
        background = BackgroundDragon(),
        elementTag = listOf(ElementTag.DRAGON, ElementTag.FLYING)
    )
}