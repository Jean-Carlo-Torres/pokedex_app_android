package br.com.pokedex

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.pokedex.ui.screens.SplashScreen
import br.com.pokedex.ui.theme.PokedexTheme
import java.util.Timer
import java.util.TimerTask

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                SplashScreen()
            }
        }

        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }
        }, 2000)
    }
}