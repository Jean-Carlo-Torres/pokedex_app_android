package br.com.pokedex.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.pokedex.dao.UsuarioDao
import br.com.pokedex.model.Usuario

@Database(
    entities = [Usuario::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDao
}