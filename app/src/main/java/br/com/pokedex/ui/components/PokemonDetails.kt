package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.theme.PokedexTheme

@Composable
fun PokemonDetails(pokemon: Pokemon) {
    Column(
        modifier = Modifier.padding(top = 16.dp)
    ) {
        Row {
            Row(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Peso:",
                    fontSize = 8.sp,
                )
                Surface(
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    Text(
                        text = "${pokemon.peso} kg",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
            Row(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Altura:",
                    fontSize = 8.sp,
                )
                Surface(
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    Text(
                        text = "${pokemon.altura} m",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
        Row(
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Row(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Categoria:",
                    fontSize = 8.sp,
                )
                Surface(
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    Text(
                        text = pokemon.categoria.name,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
            Row(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Habilidades:",
                    fontSize = 8.sp,
                )
                Column(
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    pokemon.habilidades.forEach { habilidade ->
                        Surface(
                            shape = RoundedCornerShape(4.dp),
                            modifier = Modifier.padding(top = 4.dp)
                        ) {
                            Text(
                                text = habilidade,
                                modifier = Modifier.padding(8.dp)
                            )
                        }
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
            val habilidades = listOf("Overgrow", "Chlorophyll")
            PokemonDetails(
                Pokemon(
                    imagem = "https://img.pokemondb.net/sprites/x-y/normal/bulbasaur.png",
                    nome = "Bulbasaur",
                    numero = 1,
                    tipo = "Grama",
                    descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
                    peso = 6.9,
                    altura = 0.7,
                    categoria = Categoria.SEED,
                    habilidades = habilidades.toTypedArray()
                )
            )
        }
    }
}