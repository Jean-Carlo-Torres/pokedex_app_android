package br.com.pokedex.model

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import br.com.pokedex.database.AppDatabase
import br.com.pokedex.repository.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application) {
    private val userRepository: UserRepository
    init {
        val userDao = AppDatabase.getDatabase(application).usuarioDao()
        userRepository = UserRepository(userDao)
    }

    var user: Usuario? by mutableStateOf(null)
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

    fun insertUser(usuario: Usuario) = viewModelScope.launch {
        userRepository.insert(usuario)
    }

    fun updateUser(usuario: Usuario) = viewModelScope.launch {
        userRepository.update(usuario)
    }

    suspend fun validateUser(email: String, senha: String): Usuario? {
        val usuario = userRepository.validateUser(email, senha)
        user = usuario
        return usuario
    }

    fun addPokemon(namePokemon: String) = viewModelScope.launch {
        user?.let { usuario ->
            if (!usuario.pokemonsFavoritos.contains(namePokemon)) {
                val updatedFavorites = usuario.pokemonsFavoritos.toMutableList()
                updatedFavorites.add(namePokemon)
                usuario.pokemonsFavoritos = updatedFavorites
                updateUser(usuario)
            }
        }
    }
}