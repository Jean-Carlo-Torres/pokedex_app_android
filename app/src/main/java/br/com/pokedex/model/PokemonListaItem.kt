package br.com.pokedex.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import br.com.pokedex.ui.components.BackgroundCard

class PokemonListaItem (
    val nome: String,
    val numero: String,
    val imagemPokemon: Painter,
    val background: BackgroundCard,
    val element: List<@Composable () -> Unit>
)