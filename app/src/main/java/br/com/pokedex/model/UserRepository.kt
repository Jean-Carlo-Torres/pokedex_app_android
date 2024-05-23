package br.com.pokedex.model

import br.com.pokedex.dao.UsuarioDao

class UserRepository(private val userDao: UsuarioDao) {
    suspend fun insert(usuario: Usuario) {
        userDao.insert(usuario)
    }
}
