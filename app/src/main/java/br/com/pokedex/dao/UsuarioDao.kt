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
    suspend fun insert(usuario: Usuario): Long

    @Update
    suspend fun update(usuario: Usuario)

    @Delete
    suspend fun delete(usuario: Usuario)

    @Query("SELECT * FROM Usuario WHERE id = :id")
    suspend fun getUserById(id: Long): Usuario?

    @Query("SELECT * FROM Usuario")
    suspend fun getAllUsers(): List<Usuario>

    @Query("SELECT * FROM Usuario WHERE email = :email AND senha = :senha")
    suspend fun getUserByEmailAndPassword(email: String, senha: String): Usuario?

    @Query("DELETE FROM Usuario")
    suspend fun deleteAllUsers()
}