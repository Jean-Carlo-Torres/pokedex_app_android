package br.com.pokedex.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.pokedex.ui.screens.CadastroRealizadoScreen
import br.com.pokedex.ui.screens.CardPokemonScreen
import br.com.pokedex.ui.screens.FormaDeCadastroScreen
import br.com.pokedex.ui.screens.FormularioCadastroScreen
import br.com.pokedex.ui.screens.ListaPokemonScreen
import br.com.pokedex.ui.screens.OnboardingScreen
import br.com.pokedex.ui.theme.PokedexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                val navController = rememberNavController()
                
                NavHost(navController = navController, startDestination = "onboardingScreen"){

                    composable(
                        route = "onboardingScreen"
                    ) {
                        OnboardingScreen(navController = navController)
                    }

                    composable(
                        route = "formaDeCadastroScreen"
                    ) {
                        FormaDeCadastroScreen(navController)
                    }
                    
                    composable(
                        route = "formularioCadastroScreen"
                    ) {
                        FormularioCadastroScreen(navController = navController)
                    }

                    composable(
                        route = "cadastroRealizadoScreen"
                    ) {
                        CadastroRealizadoScreen(navController)
                    }

                    composable(
                        route = "listaPokemonScreen",
                    ) {
                        ListaPokemonScreen(navController)
                    }

                    composable(
                        route = "cardPokemonScreen/{pokemonIndex}",
                        arguments = listOf(navArgument("pokemonIndex") { type = NavType.IntType })
                    ) { backStackEntry ->
                        val pokemonIndex = backStackEntry.arguments?.getInt("pokemonIndex") ?: 0
                        CardPokemonScreen(navController, pokemonIndex)
                    }
                }
            }
        }
    }
}
