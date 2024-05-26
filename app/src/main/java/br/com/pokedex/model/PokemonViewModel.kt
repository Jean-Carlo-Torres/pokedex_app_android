package br.com.pokedex.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import br.com.pokedex.model.enums.ElementTag

class PokemonViewModel : ViewModel() {
    var selectedElementType: ElementTag?  = null
    var favoritePokemons = mutableStateListOf<PokemonListaItem>()
        private set

    fun toggleFavorite(pokemon: PokemonListaItem) {
        if (favoritePokemons.contains(pokemon)) {
            favoritePokemons.remove(pokemon)
        } else {
            favoritePokemons.add(pokemon)
        }
    }
}