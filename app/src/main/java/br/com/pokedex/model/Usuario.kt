package br.com.pokedex.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import br.com.pokedex.converters.Converters

@Entity
@TypeConverters(Converters::class)
data class Usuario(
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    val nome: String,
    val email: String,
    val senha: String,
    var pokemonsFavoritos: MutableList<String> = mutableListOf()
)