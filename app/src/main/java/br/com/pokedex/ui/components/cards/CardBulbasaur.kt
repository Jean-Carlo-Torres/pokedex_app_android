package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.pokedex.R
import br.com.pokedex.ui.components.BackgroundGrass
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementGrassButtonSmall
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementPoisonButton
import br.com.pokedex.ui.components.ElementPoisonButtonSmall
import br.com.pokedex.ui.components.ElementPsychicButton

val bulbasaur = Pokemon(
    imagemPokemon = R.drawable.bulbasaur,
    background = R.drawable.header_grass,
    nome = "Bulbasaur",
    numero = "001",
    descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
    peso = 6.9,
    altura = 0.7,
    categoria = Categoria.SEED,
    habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray(),
    element = listOf(
        { ElementGrassButton() },
        { ElementPoisonButton() }
    ),
    fraquezas = listOf(
        { ElementFireButton() },
        { ElementPsychicButton() },
        { ElementFlyingButton() },
        { ElementIceButton() }
    ),
    evolucao = emptyList()
)

val ivysaur = Pokemon(
    imagemPokemon = R.drawable.ivysaur,
    background = R.drawable.header_grass,
    nome = "Ivysaur",
    numero = "002",
    descricao = "Quando o bulbo nas costas cresce, parece perder a capacidade de ficar em pé nas patas traseiras.\n",
    peso = 13.0,
    altura = 1.0,
    categoria = Categoria.SEED,
    habilidades = listOf("Overgrow").toTypedArray(),
    element = listOf(
        { ElementGrassButton() },
        { ElementPoisonButton() }
    ),
    fraquezas = listOf(
        { ElementFireButton() },
        { ElementPsychicButton() },
        { ElementFlyingButton() },
        { ElementIceButton() }
    ),
    evolucao = emptyList()
)

val venusaur = Pokemon(
    imagemPokemon = R.drawable.venusaur,
    background = R.drawable.header_grass,
    nome = "Venusaur",
    numero = "003",
    descricao = "Sua planta floresce quando está absorvendo energia solar. Ele permanece em movimento para buscar a luz do sol.\n",
    peso = 100.0,
    altura = 2.0,
    categoria = Categoria.SEED,
    habilidades = listOf("Overgrow").toTypedArray(),
    element = listOf(
        { ElementGrassButton() },
        { ElementPoisonButton() }
    ),
    fraquezas = listOf(
        { ElementFireButton() },
        { ElementPsychicButton() },
        { ElementFlyingButton() },
        { ElementIceButton() }
    ),
    evolucao = emptyList()
)

@Composable
fun BulbasaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = bulbasaur.imagemPokemon,
        background = bulbasaur.background,
        nome = bulbasaur.nome,
        numero = bulbasaur.numero,
        descricao = bulbasaur.descricao,
        peso = bulbasaur.peso,
        altura = bulbasaur.altura,
        categoria = bulbasaur.categoria,
        habilidades = bulbasaur.habilidades,
        element = bulbasaur.element,
        fraquezas = bulbasaur.fraquezas,
        evolucao = bulbasaurEvolution()
    )
}

@Composable
fun IvysaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = ivysaur.imagemPokemon,
        background = ivysaur.background,
        nome = ivysaur.nome,
        numero = ivysaur.numero,
        descricao = ivysaur.descricao,
        peso = ivysaur.peso,
        altura = ivysaur.altura,
        categoria = ivysaur.categoria,
        habilidades = ivysaur.habilidades,
        element = ivysaur.element,
        fraquezas = ivysaur.fraquezas,
        evolucao = bulbasaurEvolution()
    )
}

@Composable
fun VenusaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = venusaur.imagemPokemon,
        background = venusaur.background,
        nome = venusaur.nome,
        numero = venusaur.numero,
        descricao = venusaur.descricao,
        peso = venusaur.peso,
        altura = venusaur.altura,
        categoria = venusaur.categoria,
        habilidades = venusaur.habilidades,
        element = venusaur.element,
        fraquezas = venusaur.fraquezas,
        evolucao = bulbasaurEvolution()
    )
}

@Composable
fun bulbasaurEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            nome = bulbasaur.nome,
            numero = bulbasaur.numero,
            imagemPokemon = bulbasaur.imagemPokemon,
            background = BackgroundGrass(),
            element = listOf(
                { ElementGrassButtonSmall() },
                { ElementPoisonButtonSmall() }
            ),
            elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
        ),
        PokemonListaItem(
            nome = ivysaur.nome,
            numero = ivysaur.numero,
            imagemPokemon = ivysaur.imagemPokemon,
            background = BackgroundGrass(),
            element = listOf(
                { ElementGrassButtonSmall() },
                { ElementPoisonButtonSmall() }
            ),
            elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
        ),
        PokemonListaItem(
            nome = venusaur.nome,
            numero = venusaur.numero,
            imagemPokemon = venusaur.imagemPokemon,
            background = BackgroundGrass(),
            element = listOf(
                { ElementGrassButtonSmall() },
                { ElementPoisonButtonSmall() }
            ),
            elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
        )
    )
}

@Composable
fun BulbasaurListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = bulbasaur.imagemPokemon,
        nome = bulbasaur.nome,
        numero = bulbasaur.numero,
        element = bulbasaur.element,
        background = BackgroundGrass(),
        elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
    )
}

@Composable
fun IvysaurListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = ivysaur.imagemPokemon,
        nome = ivysaur.nome,
        numero = ivysaur.numero,
        element = ivysaur.element,
        background = BackgroundGrass(),
        elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
    )
}

@Composable
fun VenusaurListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = venusaur.imagemPokemon,
        nome = venusaur.nome,
        numero = venusaur.numero,
        element = venusaur.element,
        background = BackgroundGrass(),
        elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
    )
}