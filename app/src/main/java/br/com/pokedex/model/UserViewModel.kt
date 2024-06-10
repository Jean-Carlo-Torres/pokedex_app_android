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
        loadLoggedUser()
    }

    var user: Usuario? by mutableStateOf(null)

    private fun loadLoggedUser() = viewModelScope.launch {
        val loggedUser = userRepository.getLoggedUser()
        user = loggedUser
    }

    fun toggleFavorite(pokemon: PokemonListaItem) {
        user?.let { usuario ->
            if (usuario.pokemonsFavoritos.contains(pokemon.nome)) {
                removePokemon(pokemon.nome)
            } else {
                addPokemon(pokemon.nome)
            }
        }
    }

    fun insertUser(usuario: Usuario) = viewModelScope.launch {
        userRepository.insert(usuario)
        user = usuario
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

    fun removePokemon(namePokemon: String) = viewModelScope.launch {
        user?.let { usuario ->
            if (usuario.pokemonsFavoritos.contains(namePokemon)) {
                val updatedFavorites = usuario.pokemonsFavoritos.toMutableList()
                updatedFavorites.remove(namePokemon)
                usuario.pokemonsFavoritos = updatedFavorites
                updateUser(usuario)
            }
        }
    }

    fun reloadUser(userId: Long) {
        viewModelScope.launch {
            user = userRepository.getUser(userId)
        }
    }

    fun userIsLogged(ativo: Boolean) {
        user?.isLogged = ativo
        viewModelScope.launch {
            user?.let { updateUser(it) }
        }
    }
}