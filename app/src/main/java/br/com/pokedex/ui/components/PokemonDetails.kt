package br.com.pokedex.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.theme.PokedexTheme

@Composable
fun PokemonDetails(pokemon: Pokemon) {
    Column(
        modifier = Modifier.padding(top = 16.dp)
    ) {
        Row {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "PESO",
                    fontSize = 8.sp
                )
                Surface(
                    modifier = Modifier
                        .border(0.5.dp, Color.Black, RoundedCornerShape(4.dp))
                        .width(154.dp)
                        .height(43.dp)
                ) {
                    Text(
                        text = "${pokemon.peso} kg",
                        fontWeight = FontWeight(500),
                        modifier = Modifier.padding(8.dp),
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "ALTURA",
                    fontSize = 8.sp
                )
                Surface(
                    modifier = Modifier
                        .border(0.5.dp, Color.Black, RoundedCornerShape(4.dp))
                        .width(154.dp)
                        .height(43.dp)
                ) {
                    Text(
                        text = "${pokemon.altura} m",
                        fontWeight = FontWeight(500),
                        modifier = Modifier.padding(8.dp),
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "CATEGORIA",
                    fontSize = 8.sp
                )
                Surface(
                    modifier = Modifier
                        .border(0.5.dp, Color.Black, RoundedCornerShape(4.dp))
                        .width(154.dp)
                        .height(43.dp)
                ) {
                    Text(
                        text = pokemon.categoria,
                        fontWeight = FontWeight(500),
                        modifier = Modifier.padding(8.dp),
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "HABILIDADES",
                    fontSize = 8.sp
                )
                Column {
                    Surface(
                        modifier = Modifier
                            .border(0.5.dp, Color.Black, RoundedCornerShape(4.dp))
                            .width(154.dp)
                            .heightIn(min = 43.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            pokemon.habilidades.forEach { habilidade ->
                                Text(
                                    text = habilidade,
                                    fontWeight = FontWeight(500),
                                    fontSize = 18.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PokemonWeaknesses(fraquezas: List<@Composable () -> Unit>) {
    PokedexTheme {
        Surface {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Fraquezas",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500)
                )
                for (i in fraquezas.indices step 2) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        fraquezas[i]()
                        fraquezas.getOrElse(i + 1) { {} }()
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun PokemonDetailsPreview() {
    PokedexTheme {
        Surface {
            PokemonDetails(
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
                        { ElementIceButton() }),
                    evolucao = listOf(PokemonListaItem(
                        nome = "Bulbasaur",
                        numero = "001",
                        imagemPokemon = R.drawable.bulbasaur,
                        background = BackgroundGrass(),
                        element = listOf(
                            { ElementGrassButtonSmall() },
                            { ElementPoisonButtonSmall() }
                        ),
                        elementTag = null
                    ))
                )
            )
        }
    }
}
