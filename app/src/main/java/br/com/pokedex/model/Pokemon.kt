package br.com.pokedex.model

import br.com.pokedex.model.enums.Categoria

class Pokemon(
    val imagem: String? = null,
    val nome: String,
    val numero: Int,
    val tipo: String,
    val descricao: String,
    val peso: Double,
    val altura: Double,
    val categoria: Categoria,
    val habilidades: Array<String>
)