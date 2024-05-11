package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonEvolutionItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementFighterButton
import br.com.pokedex.ui.components.ElementNormalButton
import br.com.pokedex.ui.components.ElementNormalButtonSmall

@Composable
fun LickitungData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.lickitung),
        background = painterResource(id = R.drawable.header_normal),
        nome = "Lickitung",
        numero = "108",
        descricao = "Se a saliva pegajosa deste Pokémon entrar em contato com você e você não a limpar, uma coceira intensa se instalará. A coceira também não desaparecerá.\n",
        peso = 65.5,
        altura = 1.2,
        categoria = Categoria.LICKING,
        habilidades = listOf("Own Tempo", "Oblivious").toTypedArray(),
        element = listOf { ElementNormalButton() },
        fraquezas = listOf { ElementFighterButton() },
        evolucao = listOf(
            PokemonEvolutionItem(
                imagemPokemon = painterResource(id = R.drawable.lickitung),
                background = painterResource(id = R.drawable.bg_evolution_normal),
                nome = "Lickitung",
                numero = "108",
                element = listOf { ElementNormalButtonSmall() }
            )
        )
    )
}