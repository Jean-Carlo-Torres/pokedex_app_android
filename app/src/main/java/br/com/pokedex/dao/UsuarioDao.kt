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
}