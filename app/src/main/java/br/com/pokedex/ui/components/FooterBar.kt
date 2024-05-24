package br.com.pokedex.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import br.com.pokedex.R

enum class FooterButton(val iconOn: Int, val iconOff: Int, val title: String) {
    POKEDEX(R.drawable.ic_pokedex_on, R.drawable.ic_pokedex_off, "Pokédex"),
    FAVORITE(R.drawable.ic_favorite_on, R.drawable.ic_favorite_off, "Favoritos"),
    USER(R.drawable.ic_user_on, R.drawable.ic_user_off, "Perfil")
}

@Composable
fun FooterBar(navController: NavController?) {
    navController?.let {
        val navBackStackEntry by it.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        var selectedButton by remember { mutableStateOf(FooterButton.POKEDEX) }

        selectedButton = when (currentRoute) {
            "listaPokemonScreen" -> FooterButton.POKEDEX
            "pokemonFavoritoScreen" -> FooterButton.FAVORITE
            "perfilUsuarioScreen" -> FooterButton.USER
            else -> selectedButton
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(72.dp)
                    .background(color = Color.White),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    FooterButton.values().forEach { button ->
                        IconDefault(
                            image = if (button == selectedButton) button.iconOn else button.iconOff,
                            title = if (button == selectedButton) button.title else null,
                            onClick = {
                                selectedButton = button
                                navController.navigate(
                                    when (button) {
                                        FooterButton.POKEDEX -> "listaPokemonScreen"
                                        FooterButton.FAVORITE -> "pokemonFavoritoScreen"
                                        FooterButton.USER -> "perfilUsuarioScreen"
                                    }
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}


@Composable
private fun IconDefault(image: Int, title: String?, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconButton(
            onClick = onClick,
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .width(48.dp)
                    .height(48.dp)
            )
        }
        if (title != null) {
            Text(text = title)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun FooterBarPreview() {
    FooterBar(navController = null)
}