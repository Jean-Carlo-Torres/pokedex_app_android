package br.com.pokedex.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

class PokemonEvolutionItem (
    val nome: String,
    val numero: String,
    val imagemPokemon: Painter,
    val background: Painter,
    val element: List<@Composable () -> Unit>
)