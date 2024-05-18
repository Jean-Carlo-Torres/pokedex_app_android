package br.com.pokedex.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import br.com.pokedex.model.enums.Categoria

class Pokemon(
    val imagemPokemon: Int,
    val background: Int,
    val nome: String,
    val numero: String,
    val element: List<@Composable () -> Unit>,
    val descricao: String,
    val peso: Double,
    val altura: Double,
    val categoria: Categoria,
    val habilidades: Array<String>,
    val fraquezas: List<@Composable () -> Unit>,
    val evolucao: List<PokemonListaItem>,
){}