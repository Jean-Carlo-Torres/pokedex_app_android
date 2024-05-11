package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonEvolutionItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementElectricButtonSmall
import br.com.pokedex.ui.components.ElementTerrestrialButton

@Composable
fun PikachuData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.pikachu),
        background = painterResource(id = R.drawable.header_electric),
        nome = "Pikachu",
        numero = "025",
        descricao = "Pikachu, que pode gerar uma eletricidade poderosa, tem bolsas nas bochechas que são extra macias e super elásticas.",
        peso = 6.0,
        altura = 0.4,
        categoria = Categoria.MOUSE,
        habilidades = listOf("Static").toTypedArray(),
        element = listOf { ElementElectricButton() },
        fraquezas = listOf { ElementTerrestrialButton() },
        evolucao = listOf(
            PokemonEvolutionItem(
                imagemPokemon = painterResource(id = R.drawable.pikachu),
                background = painterResource(id = R.drawable.bg_evolution_electric),
                nome = "Pikachu",
                numero = "025",
                element = listOf { ElementElectricButtonSmall() }
            )
        )
    )
}