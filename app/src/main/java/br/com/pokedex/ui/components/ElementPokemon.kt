package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pokedex.ui.theme.PokedexTheme

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