package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.ui.components.BackgroundPoison
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementPoisonButton
import br.com.pokedex.ui.components.ElementPoisonButtonSmall
import br.com.pokedex.ui.components.ElementPsychicButton
import br.com.pokedex.ui.components.ElementTerrestrialButton

@Composable
fun KoffingData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.koffing),
        background = painterResource(id = R.drawable.header_poison),
        nome = "Koffing",
        numero = "109",
        descricao = "Seu corpo está cheio de gás venenoso. Ele flutua em lixões, procurando a fumaça do lixo cru e apodrecido.\n",
        peso = 1.0,
        altura = 0.6,
        categoria = Categoria.POISON,
        habilidades = listOf("Levitate", "Neutralizing").toTypedArray(),
        element = listOf { ElementPoisonButton() },
        fraquezas = listOf(
            { ElementPsychicButton() },
            { ElementTerrestrialButton() }
        ),
        evolucao = listOf(
            PokemonListaItem(
                imagemPokemon = painterResource(id = R.drawable.koffing),
                background = BackgroundPoison(),
                nome = "Koffing",
                numero = "109",
                element = listOf { ElementPoisonButtonSmall() }
            )
        )
    )
}