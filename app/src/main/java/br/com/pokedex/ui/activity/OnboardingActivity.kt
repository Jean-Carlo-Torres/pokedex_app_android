package br.com.pokedex.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import br.com.pokedex.ui.screens.OnboardingScreen
import br.com.pokedex.ui.theme.PokedexTheme

class OnboardingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                Surface {
                    OnboardingScreen()
                }
            }
        }
    }
}