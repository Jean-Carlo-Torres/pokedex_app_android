package br.com.pokedex.model

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import br.com.pokedex.model.enums.ElementTag

class PokemonViewModel : ViewModel() {
    var selectedElementType: ElementTag? = null

    var pokemonsList = mutableStateListOf<PokemonListaItem>()
        private set

    var favoritePokemons = mutableStateListOf<PokemonListaItem>()
        private set

    var sortedListIndex = 0

    fun toggleFavorite(pokemon: PokemonListaItem) {
        if (favoritePokemons.contains(pokemon)) {
            favoritePokemons.remove(pokemon)
        } else {
            favoritePokemons.add(pokemon)
        }
    }
}