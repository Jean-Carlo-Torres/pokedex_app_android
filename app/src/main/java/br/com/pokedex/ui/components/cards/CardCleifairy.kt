package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonEvolutionItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementFairyButtom
import br.com.pokedex.ui.components.ElementFairyButtonSmall
import br.com.pokedex.ui.components.ElementMetalButton
import br.com.pokedex.ui.components.ElementPoisonButton

@Composable
fun CleifairyData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.clefairy),
        background = painterResource(id = R.drawable.header_fairy),
        nome = "Clefairy",
        numero = "035",
        descricao = "Diz-se que a felicidade virá para aqueles que virem uma reunião de Clefairy dançando sob a lua cheia.\n",
        peso = 7.5,
        altura = 1.1,
        categoria = Categoria.FAIRY,
        habilidades = listOf("Cute Charm", "Magig Guard").toTypedArray(),
        element = listOf { ElementFairyButtom() },
        fraquezas = listOf(
            { ElementMetalButton() },
            { ElementPoisonButton() }
        ),
        evolucao = listOf(
            PokemonEvolutionItem(
                imagemPokemon = painterResource(id = R.drawable.clefairy),
                background = painterResource(id = R.drawable.bg_evolution_fairy),
                nome = "Clefairy",
                numero = "035",
                element = listOf { ElementFairyButtonSmall() }
            )
        )
    )
}