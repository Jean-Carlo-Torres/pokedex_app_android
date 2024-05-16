package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.ui.components.BackgroundStone
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementFighterButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementMetalButton
import br.com.pokedex.ui.components.ElementStoneButton
import br.com.pokedex.ui.components.ElementStoneButtonSmall
import br.com.pokedex.ui.components.ElementTerrestrialButton
import br.com.pokedex.ui.components.ElementTerrestrialButtonSmall
import br.com.pokedex.ui.components.ElementWaterButton

@Composable
fun OnixData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.onix),
        background = painterResource(id = R.drawable.header_stone),
        nome = "Onix",
        numero = "095",
        descricao = "À medida que escava o solo, absorve muitos objetos duros. Isso é o que torna seu corpo tão sólido.",
        peso = 210.0,
        altura = 8.8,
        categoria = Categoria.ROCK,
        habilidades = listOf("Rock Head", "Sturdy").toTypedArray(),
        element = listOf(
            { ElementStoneButton() },
            { ElementTerrestrialButton() }
        ),
        fraquezas = listOf(
            { ElementMetalButton() },
            { ElementFighterButton() },
            { ElementWaterButton() },
            { ElementIceButton() },
            { ElementGrassButton() },
            { ElementTerrestrialButton() }
        ),
        evolucao = listOf(
            PokemonListaItem(
                imagemPokemon = painterResource(id = R.drawable.onix),
                background = BackgroundStone(),
                nome = "Onix",
                numero = "095",
                element = listOf(
                    { ElementStoneButtonSmall() },
                    { ElementTerrestrialButtonSmall() },
                )
            )
        )
    )
}