package br.com.pokedex.repository

import br.com.pokedex.dao.UsuarioDao
import br.com.pokedex.model.Usuario

class UserRepository(private val userDao: UsuarioDao) {
    suspend fun insert(usuario: Usuario) {
        userDao.insert(usuario)
    }

    suspend fun update(usuario: Usuario) {
        userDao.update(usuario)
    }

     fun addPokemonFavorite(numberPokemon: String, usuario: Usuario) {
        userDao.addPokemonFavorite(numberPokemon, usuario)
    }

    suspend fun validateUser(email: String, senha: String): Usuario? {
        return userDao.getUserByEmailAndPassword(email, senha)
    }

    suspend fun getUser(userId: Long): Usuario? {
        return userDao.getUser(userId)
    }

    suspend fun getLoggedUser(): Usuario? {
        return userDao.getLoggedUser()
    }
}

