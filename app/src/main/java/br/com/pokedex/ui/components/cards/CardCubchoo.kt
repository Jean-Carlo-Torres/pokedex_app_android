package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundIce
import br.com.pokedex.ui.components.ElementFighterButton
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementIceButtonSmall
import br.com.pokedex.ui.components.ElementMetalButton
import br.com.pokedex.ui.components.ElementRockButton

val cubchoo = Pokemon(
    imagemPokemon = R.drawable.cubchoo,
    background = R.drawable.header_ice,
    nome = "Cubchoo",
    numero = "613",
    descricao = "Quando este Pokémon está bem de saúde, seu ranho fica mais grosso e pegajoso. Ele vai espalhar seu ranho em quem não gosta.",
    peso = 8.5,
    altura = 0.5,
    categoria = Categoria.CHILL.descricao,
    habilidades = listOf("Snow Cloak", "Slush Rush").toTypedArray(),
    element = listOf { ElementIceButton() },
    fraquezas = listOf(
        { ElementFireButton() },
        { ElementMetalButton() },
        { ElementFighterButton() },
        { ElementRockButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun CubchooData(): Pokemon {
    return Pokemon(
        imagemPokemon = cubchoo.imagemPokemon,
        background = cubchoo.background,
        nome = cubchoo.nome,
        numero = cubchoo.numero,
        descricao = cubchoo.descricao,
        peso = cubchoo.peso,
        altura = cubchoo.altura,
        categoria = cubchoo.categoria,
        habilidades = cubchoo.habilidades,
        element = cubchoo.element,
        fraquezas = cubchoo.fraquezas,
        evolucao = CubchooEvolution()
    )
}

@Composable
fun CubchooEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = cubchoo.imagemPokemon,
            nome = cubchoo.nome,
            numero = cubchoo.numero,
            element = listOf { ElementIceButtonSmall() },
            background = BackgroundIce(),
            elementTag = listOf(ElementTag.ICE)
        )
    )
}

@Composable
fun CubchooListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = cubchoo.imagemPokemon,
        nome = cubchoo.nome,
        numero = cubchoo.numero,
        element = cubchoo.element,
        background = BackgroundIce(),
        elementTag = listOf(ElementTag.ICE)
    )
}