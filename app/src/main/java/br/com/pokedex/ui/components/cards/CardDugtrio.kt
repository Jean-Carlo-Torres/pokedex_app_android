package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonEvolutionItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementTerrestrialButton
import br.com.pokedex.ui.components.ElementTerrestrialButtonSmall
import br.com.pokedex.ui.components.ElementWaterButton

@Composable
fun DugtrioData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.dugtrio),
        background = painterResource(id = R.drawable.header_terrestrial),
        nome = "Dugtrio",
        numero = "051",
        descricao = "Uma equipe de trigêmeos Diglett. Ele desencadeia enormes terremotos cavando 60 milhas no subsolo.",
        peso = 33.3,
        altura = 0.7,
        categoria = Categoria.DIGGER,
        habilidades = listOf("Sand Veil", "Arena Trap").toTypedArray(),
        element = listOf { ElementTerrestrialButton() },
        fraquezas = listOf(
            { ElementWaterButton() },
            { ElementGrassButton() },
            { ElementIceButton() }
        ),
        evolucao = listOf(
            PokemonEvolutionItem(
                imagemPokemon = painterResource(id = R.drawable.dugtrio),
                background = painterResource(id = R.drawable.bg_evolution_terrestrial),
                nome = "Dugtrio",
                numero = "051",
                element = listOf { ElementTerrestrialButtonSmall() }
            )
        )
    )
}