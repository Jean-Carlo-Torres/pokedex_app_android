package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.ui.theme.PokedexTheme
import coil.compose.AsyncImage

@Composable
fun CardPokemon(pokemon: Pokemon) {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AsyncImage(
                model = pokemon.imagem,
                contentDescription = null,
                Modifier
                    .fillMaxWidth()
                    .height(260.dp)
                    .padding(top = 80.dp, bottom = 16.dp),
                placeholder = painterResource(id = R.drawable.bulbasaur)
            )
            Column(
                modifier = Modifier
                    .padding(16.dp),
            ) {
                Text(
                    text = pokemon.nome,
                    fontSize = 32.sp,
                    fontWeight = FontWeight(700)
                )
                Text(
                    text = "N ${pokemon.numero}"
                )
                Row(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = { /*TODO*/ }
                    ) {
                        Text(text = "${pokemon.tipo}")
                    }
                    Button(
                        onClick = { /*TODO*/ }
                    ) {
                        Text(text = "Venenoso")
                    }
                }
                Text(
                    text = pokemon.descricao
                )
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
                    imagem = "https://img.pokemondb.net/sprites/x-y/normal/bulbasaur.png",
                    nome = "Bulbasaur",
                    numero = 1,
                    tipo = "Grama",
                    descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n"
                )
            )
        }
    }
}