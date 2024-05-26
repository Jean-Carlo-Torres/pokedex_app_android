package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.ui.components.BackgroundWater
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementWaterButton
import br.com.pokedex.ui.components.ElementWaterButtonSmall

val squirtle = Pokemon(
    imagemPokemon = R.drawable.squirtle,
    background = R.drawable.header_water,
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
    evolucao = emptyList()
)

val wartortle = Pokemon(
    imagemPokemon = R.drawable.wartortle,
    background = R.drawable.header_water,
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
    evolucao = emptyList()
)

val blastoise = Pokemon(
    imagemPokemon = R.drawable.blastoise,
    background = R.drawable.header_water,
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
    evolucao = emptyList()
)

@Composable
fun SquirtleData(): Pokemon {
    return Pokemon(
        imagemPokemon = squirtle.imagemPokemon,
        background = squirtle.background,
        nome = squirtle.nome,
        numero = squirtle.numero,
        descricao = squirtle.descricao,
        peso = squirtle.peso,
        altura = squirtle.altura,
        categoria = squirtle.categoria,
        habilidades = squirtle.habilidades,
        element = squirtle.element,
        fraquezas = squirtle.fraquezas,
        evolucao = squirtleEvolution()
    )
}

@Composable
fun WartortleData(): Pokemon {
    return Pokemon(
        imagemPokemon = wartortle.imagemPokemon,
        background = wartortle.background,
        nome = wartortle.nome,
        numero = wartortle.numero,
        descricao = wartortle.descricao,
        peso = wartortle.peso,
        altura = wartortle.altura,
        categoria = wartortle.categoria,
        habilidades = wartortle.habilidades,
        element = wartortle.element,
        fraquezas = wartortle.fraquezas,
        evolucao = squirtleEvolution()
    )
}

@Composable
fun BlastoiseData(): Pokemon {
    return Pokemon(
        imagemPokemon = blastoise.imagemPokemon,
        background = blastoise.background,
        nome = blastoise.nome,
        numero = blastoise.numero,
        descricao = blastoise.descricao,
        peso = blastoise.peso,
        altura = blastoise.altura,
        categoria = blastoise.categoria,
        habilidades = blastoise.habilidades,
        element = blastoise.element,
        fraquezas = blastoise.fraquezas,
        evolucao = squirtleEvolution()
    )
}

@Composable
fun squirtleEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = squirtle.imagemPokemon,
            nome = squirtle.nome,
            numero = squirtle.numero,
            element = listOf { ElementWaterButtonSmall() },
            background = BackgroundWater(),
            elementTag = listOf(ElementTag.WATER)
        ),
        PokemonListaItem(
            imagemPokemon = wartortle.imagemPokemon,
            nome = wartortle.nome,
            numero = wartortle.numero,
            element = listOf { ElementWaterButtonSmall() },
            background = BackgroundWater(),
            elementTag = listOf(ElementTag.WATER)
        ),
        PokemonListaItem(
            imagemPokemon = blastoise.imagemPokemon,
            nome = blastoise.nome,
            numero = blastoise.numero,
            element = listOf { ElementWaterButtonSmall() },
            background = BackgroundWater(),
            elementTag = listOf(ElementTag.WATER)
        )
    )
}

@Composable
fun SquirtleListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = squirtle.imagemPokemon,
        nome = squirtle.nome,
        numero = squirtle.numero,
        element = squirtle.element,
        background = BackgroundWater(),
        elementTag = listOf(ElementTag.WATER)
    )
}

@Composable
fun WartortleListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = wartortle.imagemPokemon,
        nome = wartortle.nome,
        numero = wartortle.numero,
        element = wartortle.element,
        background = BackgroundWater(),
        elementTag = listOf(ElementTag.WATER)
    )
}

@Composable
fun BlastoiseListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = blastoise.imagemPokemon,
        nome = blastoise.nome,
        numero = blastoise.numero,
        element = blastoise.element,
        background = BackgroundWater(),
        elementTag = listOf(ElementTag.WATER)
    )
}