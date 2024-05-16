package br.com.pokedex.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
fun ListaCardPokemon(pokemon: PokemonListaItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(102.dp)
            .border(0.5.dp, Color.Gray, RoundedCornerShape(15.dp))
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
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
                    .height(36.dp),
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
                painter = pokemon.imagemPokemon,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center)
            )
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
            imagemPokemon = painterResource(R.drawable.bulbasaur),
            background = BackgroundGrass(),
            element = listOf(
                { ElementGrassButton() },
                { ElementPoisonButton() }
            ),
        )
    )
}