package br.com.pokedex.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import br.com.pokedex.database.AppDatabase
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application) {
    private val userRepository: UserRepository

    init {
        val userDao = AppDatabase.getDatabase(application).usuarioDao()
        userRepository = UserRepository(userDao)
    }

    fun insertUser(usuario: Usuario) = viewModelScope.launch {
        userRepository.insert(usuario)
    }
}
