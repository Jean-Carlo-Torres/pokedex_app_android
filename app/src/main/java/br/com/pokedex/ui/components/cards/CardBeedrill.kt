package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.ui.components.BackgroundInsect
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementInsectButton
import br.com.pokedex.ui.components.ElementInsectButtonSmall
import br.com.pokedex.ui.components.ElementPoisonButton
import br.com.pokedex.ui.components.ElementPoisonButtonSmall
import br.com.pokedex.ui.components.ElementPsychicButton
import br.com.pokedex.ui.components.ElementStoneButton

@Composable
fun BeedrillData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.beedrill),
        background = painterResource(id = R.drawable.header_insect),
        nome = "Beedrill",
        numero = "015",
        descricao = "Tem três ferrões venenosos nas patas dianteiras e na cauda. Eles são usados ​​para espetar seu inimigo repetidamente.",
        peso = 29.5,
        altura = 1.0,
        categoria = Categoria.POISON,
        habilidades = listOf("Swarm").toTypedArray(),
        element = listOf(
            { ElementInsectButton() },
            { ElementPoisonButton() }
        ),
        fraquezas = listOf(
            { ElementFireButton() },
            { ElementPsychicButton() },
            { ElementFlyingButton() },
            { ElementStoneButton() },
        ),
        evolucao = listOf(
            PokemonListaItem(
                imagemPokemon = painterResource(id = R.drawable.beedrill),
                background = BackgroundInsect(),
                nome = "Beedrill",
                numero = "015",
                element = listOf(
                    { ElementInsectButtonSmall() },
                    { ElementPoisonButtonSmall() }
                )
            )
        )
    )
}