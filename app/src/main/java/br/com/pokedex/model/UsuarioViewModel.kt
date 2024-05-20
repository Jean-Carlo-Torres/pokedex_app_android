package br.com.pokedex.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class UsuarioViewModel : ViewModel() {
    var usuario by mutableStateOf(Usuario("", "", ""))

    fun updateUsuario(nome: String, email: String, senha: String) {
        usuario = Usuario(nome, email, senha)
    }
}