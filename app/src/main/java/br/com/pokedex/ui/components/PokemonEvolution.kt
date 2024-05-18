package br.com.pokedex.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.R
import br.com.pokedex.model.PokemonListaItem

@Composable
fun PokemonEvolution(pokemonEvolution: List<PokemonListaItem>) {
    Column {
        Text(
            text = "Evoluções",
            fontSize = 18.sp,
            fontWeight = FontWeight(500),
        )
        Column(
            modifier = Modifier
                .padding(top = 16.dp)
                .border(0.5.dp, Color.Gray, RoundedCornerShape(10.dp))
        ) {
            if (pokemonEvolution.size == 1) {
                Text(
                    text = "Este Pokémon não evolui.",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 16.dp)
                )
            }
            pokemonEvolution.forEachIndexed { index, evolution ->
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .widthIn(
                            min =
                            296.dp
                        )
                        .height(76.dp)
                        .border(0.5.dp, Color.Gray, RoundedCornerShape(50.dp))
                ) {
                    Box(
                        modifier = Modifier
                            .width(96.dp)
                            .background(
                                color = evolution.background.backgroundColor,
                                shape = RoundedCornerShape(50.dp)
                            ),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Image(
                            painter = evolution.background.icone,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp)
                        )
                        Image(
                            painter = painterResource(evolution.imagemPokemon),
                            contentDescription = null,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .weight(1f)
                    ) {
                        Text(
                            text = evolution.nome,
                            fontSize = 16.sp,
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(top = 8.dp)
                        )
                        Text(
                            text = "Nº${evolution.numero}",
                            fontSize = 12.sp
                        )
                        Row(
                            modifier = Modifier,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            evolution.element.forEach { element ->
                                element()
                            }
                        }
                    }
                }
                if (index < pokemonEvolution.lastIndex) {
                    Row(
                        modifier = Modifier
                            .width(120.dp)
                            .padding(top = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Image(
                            painter = painterResource(id = R.drawable.arrow_down),
                            contentDescription = null,
                            modifier = Modifier
                                .width(18.dp)
                                .height(28.dp)
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PokemonEvolutionPreview() {
    val evolutionList = listOf(
        PokemonListaItem(
            nome = "Bulbasaur",
            numero = "001",
            imagemPokemon = R.drawable.bulbasaur,
            background = BackgroundGrass(),
            element = listOf(
                { ElementGrassButtonSmall() },
                { ElementPoisonButtonSmall() }
            ),
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
        )
    )
    PokemonEvolution(pokemonEvolution = evolutionList)
}
