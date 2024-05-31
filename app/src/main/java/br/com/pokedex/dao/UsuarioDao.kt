package br.com.pokedex.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.pokedex.model.Usuario

@Dao
interface UsuarioDao {

    @Insert
    fun insert(usuario: Usuario): Long

    @Update
    fun update(usuario: Usuario)

    @Delete
    fun delete(usuario: Usuario)

    @Query("SELECT * FROM Usuario WHERE email = :email AND senha = :senha")
    suspend fun getUserByEmailAndPassword(email: String, senha: String): Usuario?

    fun addPokemonFavorite(numberPokemon: String, usuario: Usuario) {
        usuario.pokemonsFavoritos.add(numberPokemon)
        update(usuario)
    }

    @Query("SELECT * FROM Usuario")
    abstract fun getUser(): Usuario
}