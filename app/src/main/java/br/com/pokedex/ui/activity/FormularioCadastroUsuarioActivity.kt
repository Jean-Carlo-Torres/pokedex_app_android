package br.com.pokedex.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.pokedex.ui.activity.ui.theme.PokedexTheme
import br.com.pokedex.ui.screens.FormularioCadastroScreen

class FormularioCadastroUsuarioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                FormularioCadastroScreen()
            }
        }
    }
}