package br.com.pokedex.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import br.com.pokedex.ui.screens.CardPokemonFavoritoScreen
import br.com.pokedex.ui.screens.CardPokemonScreen
import br.com.pokedex.ui.screens.FormaDeCadastroScreen
import br.com.pokedex.ui.screens.FormaDeLoginScreen
import br.com.pokedex.ui.screens.FormularioCadastroScreen
import br.com.pokedex.ui.screens.FormularioDeLoginScreen
import br.com.pokedex.ui.screens.ListaPokemonScreen
import br.com.pokedex.ui.screens.LoadingScreen
import br.com.pokedex.ui.screens.LoginSucessoScreen
import br.com.pokedex.ui.screens.OnboardingScreen
import br.com.pokedex.ui.screens.PerfilUsuarioScreen
import br.com.pokedex.ui.screens.PokemonFavoritoScreen
import br.com.pokedex.ui.screens.TrocarEmailPerfil
import br.com.pokedex.ui.screens.TrocarNomePerfil
import br.com.pokedex.ui.screens.TrocarSenhaPerfil
import br.com.pokedex.ui.theme.PokedexTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                val navController = rememberNavController()
                val pokemonViewModel: PokemonViewModel = viewModel()
                val userViewModel: UserViewModel = viewModel()

                val startDestination: String

                var isLoading by remember { mutableStateOf(true) }

                LaunchedEffect(key1 = true) {
                    delay(3000)
                    isLoading = false
                }

                when {
                    isLoading -> {
                        LoadingScreen()
                    }
                    else -> {
                        startDestination = if (userViewModel.user?.isLogged == true) {
                            "listaPokemonScreen"
                        } else {
                            "onboardingScreen"
                        }

                        NavHost(
                            navController = navController,
                            startDestination = startDestination
                        ) {
                            composable(route = "onboardingScreen") {
                                OnboardingScreen(navController = navController)
                            }

                            composable(route = "formaDeCadastroScreen") {
                                FormaDeCadastroScreen(navController)
                            }

                            composable(route = "formularioCadastroScreen") {
                                FormularioCadastroScreen(navController, userViewModel)
                            }

                            composable(route = "cadastroRealizadoScreen") {
                                CadastroRealizadoScreen(navController)
                            }

                            composable(route = "formaDeLoginScreen") {
                                FormaDeLoginScreen(navController)
                            }

                            composable(route = "formularioDeLoginScreen") {
                                FormularioDeLoginScreen(navController, userViewModel)
                            }

                            composable(route = "loginSucessoScreen") {
                                LoginSucessoScreen(navController)
                            }

                            composable(route = "listaPokemonScreen") {
                                ListaPokemonScreen(navController, pokemonViewModel, userViewModel)
                            }

                            composable(route = "pokemonType") {
                                PokemonType(navController, pokemonViewModel)
                            }

                            composable(route = "sortListItems") {
                                SortListItems(
                                    navController = navController,
                                    viewModel = pokemonViewModel
                                )
                            }

                            composable(route = "pokemonFavoritoScreen") {
                                PokemonFavoritoScreen(
                                    userViewModel = userViewModel,
                                    navController = navController
                                )
                            }

                            composable(route = "perfilUsuarioScreen") {
                                PerfilUsuarioScreen(
                                    navController = navController,
                                    userViewModel = userViewModel
                                )
                            }

                            composable(route = "trocarNomePerfil") {
                                TrocarNomePerfil(
                                    navController = navController,
                                    userViewModel = userViewModel
                                )
                            }

                            composable(route = "trocarEmailPerfil") {
                                TrocarEmailPerfil(
                                    navController = navController,
                                    userViewModel = userViewModel
                                )
                            }

                            composable(route = "trocarSenhaPerfil") {
                                TrocarSenhaPerfil(
                                    navController = navController,
                                    userViewModel = userViewModel
                                )
                            }

                            composable(
                                route = "cardPokemonScreen/{pokemonNumber}",
                                arguments = listOf(navArgument("pokemonNumber") {
                                    type = NavType.StringType
                                })
                            ) { backStackEntry ->
                                val pokemonNumber =
                                    backStackEntry.arguments?.getString("pokemonNumber") ?: "001"
                                CardPokemonScreen(navController, pokemonNumber, pokemonViewModel)
                            }

                            composable(
                                route = "cardPokemonFavoritoScreen/{pokemonNumber}",
                                arguments = listOf(navArgument("pokemonNumber") {
                                    type = NavType.StringType
                                })
                            ) { backStackEntry ->
                                val pokemonNumber =
                                    backStackEntry.arguments?.getString("pokemonNumber")
                                if (pokemonNumber != null) {
                                    CardPokemonFavoritoScreen(
                                        navController,
                                        pokemonNumber,
                                        userViewModel
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}