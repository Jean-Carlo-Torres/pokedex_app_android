package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.pokedex.R
import br.com.pokedex.ui.components.BackgroundGrass
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementGrassButtonSmall
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementPoisonButton
import br.com.pokedex.ui.components.ElementPoisonButtonSmall
import br.com.pokedex.ui.components.ElementPsychicButton

@Composable
fun BulbasaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.bulbasaur),
        background = painterResource(id = R.drawable.header_grass),
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
        evolucao = bulbasaurEvolution()
    )
}

@Composable
fun IvysaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.ivysaur),
        background = painterResource(id = R.drawable.header_grass),
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
        evolucao = bulbasaurEvolution()
    )
}

@Composable
fun VenusaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.venusaur),
        background = painterResource(id = R.drawable.header_grass),
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
        evolucao = bulbasaurEvolution()
    )
}

@Composable
private fun bulbasaurEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            nome = BulbasaurData().nome,
            numero = BulbasaurData().numero,
            imagemPokemon = BulbasaurData().imagemPokemon,
            background = BackgroundGrass(),
            element = listOf(
                { ElementGrassButtonSmall() },
                { ElementPoisonButtonSmall() }
            ),
        ),
        PokemonListaItem(
            nome = IvysaurData().nome,
            numero = IvysaurData().numero,
            imagemPokemon = IvysaurData().imagemPokemon,
            background = BackgroundGrass(),
            element = listOf(
                { ElementGrassButtonSmall() },
                { ElementPoisonButtonSmall() }
            )
        ),
        PokemonListaItem(
            nome = VenusaurData().nome,
            numero = VenusaurData().numero,
            imagemPokemon = VenusaurData().imagemPokemon,
            background = BackgroundGrass(),
            element = listOf(
                { ElementGrassButtonSmall() },
                { ElementPoisonButtonSmall() }
            )
        )
    )
}

@Preview
@Composable
fun BulbasaurPreview() {
    BulbasaurData()
}