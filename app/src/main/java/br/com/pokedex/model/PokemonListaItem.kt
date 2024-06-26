package br.com.pokedex.model

import androidx.compose.runtime.Composable
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.BackgroundCard

class PokemonListaItem(
    val nome: String,
    val numero: String,
    val imagemPokemon: Int,
    val background: BackgroundCard,
    val element: List<@Composable () -> Unit>,
    val elementTag: List<ElementTag>?,
    var isFavorite: Boolean = false
)