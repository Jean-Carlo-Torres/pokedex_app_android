package br.com.pokedex.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.pokedex.model.PokemonViewModel
import br.com.pokedex.model.UserViewModel
import br.com.pokedex.ui.components.PokemonType
import br.com.pokedex.ui.components.SortListItems
import br.com.pokedex.ui.screens.CadastroRealizadoScreen
import br.com.pokedex.ui.screens.CardPokemonScreen
import br.com.pokedex.ui.screens.FormaDeCadastroScreen
import br.com.pokedex.ui.screens.FormaDeLoginScreen
import br.com.pokedex.ui.screens.FormularioCadastroScreen
import br.com.pokedex.ui.screens.FormularioDeLoginScreen
import br.com.pokedex.ui.screens.ListaPokemonScreen
import br.com.pokedex.ui.screens.LoginSucessoScreen
import br.com.pokedex.ui.screens.OnboardingScreen
import br.com.pokedex.ui.screens.PerfilUsuarioScreen
import br.com.pokedex.ui.screens.PokemonFavoritoScreen
import br.com.pokedex.ui.theme.PokedexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                val navController = rememberNavController()
                val pokemonViewModel: PokemonViewModel = viewModel()
                val userViewModel: UserViewModel = viewModel()

                NavHost(navController = navController, startDestination = "onboardingScreen") {

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
                        FormularioCadastroScreen(navController = navController, userViewModel = userViewModel)
                    }

                    composable(
                        route = "cadastroRealizadoScreen"
                    ) {
                        CadastroRealizadoScreen(navController)
                    }

                    composable(
                        route = "formaDeLoginScreen"
                    ) {
                        FormaDeLoginScreen(navController)
                    }

                    composable(
                        route = "formularioDeLoginScreen"
                    ) {
                        FormularioDeLoginScreen(navController, userViewModel)
                    }

                    composable (
                        route = "loginSucessoScreen"
                    ) {
                        LoginSucessoScreen(navController)
                    }

                    composable(
                        route = "listaPokemonScreen",
                    ) {
                        ListaPokemonScreen(navController, pokemonViewModel,  userViewModel)
                    }

                    composable(
                        route = "pokemonType"
                    ) {
                        PokemonType(navController, pokemonViewModel)
                    }

                    composable(
                        route = "sortListItems"
                    ) {
                        SortListItems(navController = navController, viewModel = pokemonViewModel)
                    }

                    composable(
                        route = "pokemonFavoritoScreen"
                    ) {
                        PokemonFavoritoScreen(
                            viewModel = userViewModel,
                            navController = navController
                        )
                    }

                    composable(
                        route = "perfilUsuarioScreen"
                    ) {
                        PerfilUsuarioScreen(
                            navController = navController
                        )
                    }

                    composable(
                        route = "cardPokemonScreen/{pokemonNumber}",
                        arguments = listOf(navArgument("pokemonNumber") { type = NavType.StringType })
                    ) { backStackEntry ->
                        val pokemonNumber = backStackEntry.arguments?.getString("pokemonNumber") ?: "001"
                        CardPokemonScreen(navController, pokemonNumber, pokemonViewModel)
                    }

                }
            }
        }
    }
}

