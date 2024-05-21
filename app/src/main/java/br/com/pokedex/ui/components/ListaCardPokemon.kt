package br.com.pokedex.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.PokemonViewModel

@Composable
fun ListaCardPokemon(
    pokemon: PokemonListaItem,
    viewModel: PokemonViewModel,
    onClick: () -> Unit = {}
) {
    val isFavorite = viewModel.favoritePokemons.contains(pokemon)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(102.dp)
            .border(0.5.dp, Color.Gray, RoundedCornerShape(15.dp))
            .clickable { onClick() }
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .weight(1f)
                .align(alignment = Alignment.CenterVertically),
        ) {
            Text(
                text = "Nº${pokemon.numero}",
                fontSize = 12.sp
            )
            Text(
                text = pokemon.nome,
                fontSize = 21.sp,
                fontWeight = FontWeight(500)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                pokemon.element.forEach { element ->
                    element()
                }
            }
        }
        Box(
            modifier = Modifier
                .width(126.dp)
                .fillMaxHeight()
                .background(
                    color = pokemon.background.backgroundColor,
                    shape = RoundedCornerShape(15.dp),
                )
        ) {
            Image(
                painter = pokemon.background.icone,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp)
                    .align(Alignment.Center)
            )
            Image(
                painter = painterResource(pokemon.imagemPokemon),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .align(Alignment.Center)
            )
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(6.dp)
                    .graphicsLayer {
                        shadowElevation = 8.dp.toPx()
                        shape = CircleShape
                        clip = true
                    }
                    .drawBehind {
                        drawRect(
                            color = Color.Gray.copy(alpha = 0.5f),
                            size = size,
                        )
                    }
                    .background(Color.Transparent, CircleShape)
                    .border(1.dp, Color.White, CircleShape)
                    .clickable { viewModel.toggleFavorite(pokemon) }
            ) {
                Icon(
                    imageVector = if (isFavorite) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    tint = if (isFavorite) Color.Red else Color.White,
                    modifier = Modifier
                        .width(24.dp)
                        .padding(4.5.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ListaCardPokemonPreview() {
    ListaCardPokemon(
        PokemonListaItem(
            nome = "Bulbasaur",
            numero = "001",
            imagemPokemon = R.drawable.bulbasaur,
            background = BackgroundGrass(),
            element = listOf(
                { ElementGrassButton() },
                { ElementPoisonButton() }
            ),
        ),
        PokemonViewModel()
    )
}