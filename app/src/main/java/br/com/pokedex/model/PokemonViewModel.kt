package br.com.pokedex.model

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class PokemonViewModel : ViewModel() {
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