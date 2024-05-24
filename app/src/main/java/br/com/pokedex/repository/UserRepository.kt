package br.com.pokedex.repository

import br.com.pokedex.dao.UsuarioDao
import br.com.pokedex.model.Usuario

class UserRepository(private val userDao: UsuarioDao) {
    suspend fun insert(usuario: Usuario) {
        userDao.insert(usuario)
    }

    suspend fun validateUser(email: String, senha: String): Usuario? {
        return userDao.getUserByEmailAndPassword(email, senha)
    }
}

