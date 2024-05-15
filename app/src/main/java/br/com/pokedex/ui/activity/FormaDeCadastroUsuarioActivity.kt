package br.com.pokedex.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.pokedex.ui.activity.ui.theme.PokedexTheme
import br.com.pokedex.ui.screens.FormaDeCadastroScreen

class FormaDeCadastroUsuarioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                FormaDeCadastroScreen ()
            }
        }
    }
}

