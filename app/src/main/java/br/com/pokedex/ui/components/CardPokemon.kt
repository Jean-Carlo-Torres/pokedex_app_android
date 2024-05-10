package br.com.pokedex.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
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
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.theme.PokedexTheme
import coil.compose.AsyncImage

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
                    painter = pokemon.background,
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
                    .heightIn(max = 280.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = pokemon.imagemPokemon,
                    contentDescription = null,
                    modifier = if (pokemon.imagemPokemon.intrinsicSize.width > 200 && pokemon.imagemPokemon.intrinsicSize.height > 200) {
                        Modifier
                            .fillMaxWidth()
                            .aspectRatio(pokemon.imagemPokemon.intrinsicSize.width / pokemon.imagemPokemon.intrinsicSize.height)
                            .padding(
                                top = 16.dp,
                                start = 16.dp,
                                end = 16.dp,
                                bottom = 24.dp
                            )
                    } else {
                        Modifier
                            .fillMaxWidth()
                            .height(240.dp)
                            .padding(16.dp)
                    },
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
                }
            }
        }
    }
}

@Composable
fun ElementPokemon(vararg elementButtons: @Composable () -> Unit) {
    PokedexTheme {
        Surface {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                for (i in elementButtons.indices step 2) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        elementButtons[i]()
                        elementButtons.getOrElse(i + 1) { {} }()
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun ElementPokemonPreview() {
    ElementPokemon(
        { ElementGrassButton() },
        { ElementPoisonButton() }
    )
}


@Preview
@Composable
private fun CardPokemonPreview() {
    PokedexTheme {
        Surface {
            CardPokemon(
                Pokemon(
                    imagemPokemon = painterResource(R.drawable.charmander),
                    background = painterResource(id = R.drawable.header_grass),
                    nome = "Bulbasaur",
                    numero = "001",
                    descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
                    peso = 6.9,
                    altura = 0.7,
                    categoria = Categoria.SEED,
                    habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray(),
                    element = listOf({ ElementGrassButton() }, { ElementPoisonButton() }),
                    fraquezas = listOf(
                        { ElementFireButton() },
                        { ElementPsychicButton() },
                        { ElementFlyingButton() },
                        { ElementIceButton() })
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
                    imagemPokemon = painterResource(R.drawable.charizard),
                    background = painterResource(id = R.drawable.header_grass),
                    nome = "Bulbasaur",
                    numero = "001",
                    descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
                    peso = 6.9,
                    altura = 0.7,
                    categoria = Categoria.SEED,
                    habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray(),
                    element = listOf({ ElementGrassButton() }, { ElementPoisonButton() }),
                    fraquezas = listOf(
                        { ElementFireButton() },
                        { ElementPsychicButton() },
                        { ElementFlyingButton() },
                        { ElementIceButton() })
                )
            )
        }
    }
}