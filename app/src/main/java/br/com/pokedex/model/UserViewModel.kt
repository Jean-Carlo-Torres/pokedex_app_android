package br.com.pokedex.model

import android.app.Application
import androidx.compose.runtime.mutableStateListOf
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

    val user = userRepository.getUser()

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
        return userRepository.validateUser(email, senha)
    }

    fun addPokemon(numberPokemon: String, usuario: Usuario) = viewModelScope.launch {
        if (!usuario.pokemonsFavoritos.contains(numberPokemon)) {
            val updatedFavorites = usuario.pokemonsFavoritos.toMutableList()
            updatedFavorites.add(numberPokemon)
            usuario.pokemonsFavoritos = updatedFavorites
            updateUser(usuario)
        }
    }
}