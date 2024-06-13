package br.com.pokedex.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.theme.PokedexTheme

@Composable
fun CardPokemon(pokemon: Pokemon) {
    Box {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color.Transparent
                )
                .paint(
                    painter = painterResource(id = pokemon.background),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.TopStart
                )
        ) { }
        Column(
            modifier = Modifier
                .padding(
                    top = 100.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 420.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(pokemon.imagemPokemon),
                    contentDescription = null,
                    modifier =
                    Modifier
                        .fillMaxWidth()
                        .heightIn(min = 250.dp),
                    alignment = Alignment.TopCenter
                )
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = pokemon.nome,
                    fontSize = 32.sp,
                    fontWeight = FontWeight(700)
                )
                Text(text = "Nº ${pokemon.numero}")
                Row(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    pokemon.element.forEach { element ->
                        element()
                    }
                }
                Text(text = pokemon.descricao)
                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    PokemonDetails(pokemon = pokemon)
                    PokemonWeaknesses(pokemon.fraquezas)
                    PokemonEvolution(pokemon.evolucao)
                }
            }
        }
    }
}

@Preview
@Composable
private fun CardPokemonPreview() {
    PokedexTheme {
        Surface {
            CardPokemon(
                Pokemon(
                    imagemPokemon = R.drawable.bulbasaur,
                    background = R.drawable.header_grass,
                    nome = "Bulbasaur",
                    numero = "001",
                    descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
                    peso = 6.9,
                    altura = 0.7,
                    categoria = Categoria.SEED.descricao,
                    habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray(),
                    element = listOf({ ElementGrassButton() }, { ElementPoisonButton() }),
                    fraquezas = listOf(
                        { ElementFireButton() },
                        { ElementPsychicButton() },
                        { ElementFlyingButton() },
                        { ElementIceButton() }
                    ),
                    evolucao = listOf(
                        PokemonListaItem(
                            nome = "Bulbasaur",
                            numero = "001",
                            imagemPokemon = R.drawable.bulbasaur,
                            background = BackgroundGrass(),
                            element = listOf(
                                { ElementGrassButtonSmall() },
                                { ElementPoisonButtonSmall() }
                            ),
                            elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
                        ),
                        PokemonListaItem(
                            nome = "Bulbasaur",
                            numero = "001",
                            imagemPokemon = R.drawable.bulbasaur,
                            background = BackgroundGrass(),
                            element = listOf(
                                { ElementGrassButtonSmall() },
                                { ElementPoisonButtonSmall() }
                            ),
                            elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
                        ),
                        PokemonListaItem(
                            nome = "Bulbasaur",
                            numero = "001",
                            imagemPokemon = R.drawable.bulbasaur,
                            background = BackgroundGrass(),
                            element = listOf(
                                { ElementGrassButtonSmall() },
                                { ElementPoisonButtonSmall() }
                            ),
                            elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
                        )
                    )
                )
            )
        }
    }
}

@Preview
@Composable
private fun CardPokemonPreview2() {
    PokedexTheme {
        Surface {
            CardPokemon(
                Pokemon(
                    imagemPokemon = R.drawable.charizard,
                    background = R.drawable.header_grass,
                    nome = "Bulbasaur",
                    numero = "001",
                    descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
                    peso = 6.9,
                    altura = 0.7,
                    categoria = Categoria.SEED.descricao,
                    habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray(),
                    element = listOf({ ElementGrassButton() }, { ElementPoisonButton() }),
                    fraquezas = listOf(
                        { ElementFireButton() },
                        { ElementPsychicButton() },
                        { ElementFlyingButton() },
                        { ElementIceButton() }),
                    evolucao = listOf(
                        PokemonListaItem(
                            nome = "Bulbasaur",
                            numero = "001",
                            imagemPokemon = R.drawable.bulbasaur,
                            background = BackgroundGrass(),
                            element = listOf(
                                { ElementGrassButtonSmall() },
                                { ElementPoisonButtonSmall() }
                            ),
                            elementTag = listOf(ElementTag.GRASS, ElementTag.POISON)
                        )
                    )
                )
            )
        }
    }
}