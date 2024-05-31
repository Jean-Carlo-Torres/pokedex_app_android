package br.com.pokedex.model

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import br.com.pokedex.model.enums.ElementTag

class PokemonViewModel : ViewModel() {
    var selectedElementType: ElementTag? = null

    var pokemonsList = mutableStateListOf<PokemonListaItem>()
        private set

    var sortedListIndex = 0
}