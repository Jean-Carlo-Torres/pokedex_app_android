package br.com.pokedex.model

import androidx.compose.ui.graphics.painter.Painter
import br.com.pokedex.model.enums.Categoria

class Pokemon(
    val imagemPokemon: String? = null,
    val background: Painter,
    val nome: String,
    val numero: String,
    val descricao: String,
    val peso: Double,
    val altura: Double,
    val categoria: Categoria,
    val habilidades: Array<String>
)