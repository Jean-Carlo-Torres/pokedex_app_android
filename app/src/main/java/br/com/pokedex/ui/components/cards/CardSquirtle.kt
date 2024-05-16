package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.ui.components.BackgroundWater
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementWaterButton
import br.com.pokedex.ui.components.ElementWaterButtonSmall

@Composable
fun SquirtleData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.squirtle),
        background = painterResource(id = R.drawable.header_water),
        nome = "Squirtle",
        numero = "007",
        descricao = "Quando retrai seu longo pescoço em sua concha, esguicha água com força vigorosa.",
        peso = 9.0,
        altura = 0.5,
        categoria = Categoria.TURTLE,
        habilidades = listOf("Torrent").toTypedArray(),
        element = listOf { ElementWaterButton() },
        fraquezas = listOf(
            { ElementGrassButton() },
            { ElementElectricButton() }
        ),
        evolucao = squirtleEvolution()
    )
}

@Composable
fun WartortleData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.wartortle),
        background = painterResource(id = R.drawable.header_water),
        nome = "Wartortle",
        numero = "008",
        descricao = "É reconhecido como um símbolo de longevidade. Se a concha tiver algas, esse Wartortle é muito antigo.\n",
        peso = 22.5,
        altura = 1.0,
        categoria = Categoria.TURTLE,
        habilidades = listOf("Torrent").toTypedArray(),
        element = listOf { ElementWaterButton() },
        fraquezas = listOf(
            { ElementGrassButton() },
            { ElementElectricButton() }
        ),
        evolucao = squirtleEvolution()
    )
}

@Composable
fun BlastoiseData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.blastoise),
        background = painterResource(id = R.drawable.header_water),
        nome = "Blastoise",
        numero = "009",
        descricao = "Ele esmaga seu inimigo sob seu corpo pesado para causar desmaios. Em uma pitada, ele se retirará dentro de sua concha.\n",
        peso = 85.5,
        altura = 1.6,
        categoria = Categoria.SHELLFISH,
        habilidades = listOf("Torrent").toTypedArray(),
        element = listOf { ElementWaterButton() },
        fraquezas = listOf(
            { ElementGrassButton() },
            { ElementElectricButton() }
        ),
        evolucao = squirtleEvolution()
    )
}

@Composable
fun squirtleEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = painterResource(id = R.drawable.squirtle),
            background = BackgroundWater(),
            nome = "Squirtle",
            numero = "007",
            element = listOf { ElementWaterButtonSmall() }
        ),
        PokemonListaItem(
            imagemPokemon = painterResource(id = R.drawable.wartortle),
            background = BackgroundWater(),
            nome = "Wartortle",
            numero = "008",
            element = listOf { ElementWaterButtonSmall() }
        ),
        PokemonListaItem(
            imagemPokemon = painterResource(id = R.drawable.blastoise),
            background = BackgroundWater(),
            nome = "Blastoise",
            numero = "009",
            element = listOf { ElementWaterButtonSmall() }
        )
    )
}