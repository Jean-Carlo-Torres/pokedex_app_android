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

    fun toggleFavorite(pokemon: PokemonListaItem) {
        if (favoritePokemons.contains(pokemon)) {
            favoritePokemons.remove(pokemon)
        } else {
            favoritePokemons.add(pokemon)
        }
    }

    fun sortPokemonListBySmallestNumber() {
        pokemonsList.sortBy { it.numero }
    }

    fun sortPokemonListByBiggestNumber() {
        pokemonsList.sortByDescending { it.numero }
    }

    fun sortPokemonListByAlphabet() {
        pokemonsList.sortBy { it.nome }
    }

    fun sortPokemonListByAlphabetReverse() {
        pokemonsList.sortByDescending { it.nome }
    }
}