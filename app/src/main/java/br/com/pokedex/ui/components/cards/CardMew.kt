package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonEvolutionItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementGhostButton
import br.com.pokedex.ui.components.ElementInsectButton
import br.com.pokedex.ui.components.ElementNocturnalButton
import br.com.pokedex.ui.components.ElementPsychicButton
import br.com.pokedex.ui.components.ElementPsychicButtonSmall

@Composable
fun MewData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.mew),
        background = painterResource(id = R.drawable.header_psychic),
        nome = "Mew",
        numero = "151",
        descricao = "Quando visto através de um microscópio, o cabelo curto, fino e delicado deste Pokémon pode ser visto.\n",
        peso = 4.0,
        altura = 0.4,
        categoria = Categoria.PSYCHIC,
        habilidades = listOf("Synchronize").toTypedArray(),
        element = listOf { ElementPsychicButton() },
        fraquezas = listOf(
            { ElementGhostButton() },
            { ElementNocturnalButton() },
            { ElementInsectButton() }
        ),
        evolucao = listOf(
            PokemonEvolutionItem(
                imagemPokemon = painterResource(id = R.drawable.mew),
                background = painterResource(id = R.drawable.bg_evolution_psychic),
                nome = "Mew",
                numero = "151",
                element = listOf { ElementPsychicButtonSmall() }
            )
        )
    )
}