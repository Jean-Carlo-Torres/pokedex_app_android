package br.com.pokedex.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Usuario(
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    val nome: String,
    val email: String,
    val senha: String
)