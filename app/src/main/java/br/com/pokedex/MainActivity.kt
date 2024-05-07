package br.com.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.res.painterResource
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.CardPokemon
import br.com.pokedex.ui.theme.PokedexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokedexTheme {
                CardPokemon(
                    Pokemon(
                        imagemPokemon = "https://img.pokemondb.net/sprites/x-y/normal/bulbasaur.png",
                        background = painterResource(id = R.drawable.header_grass),
                        nome = "Bulbasaur",
                        numero = "001",
                        descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
                        peso = 6.9,
                        altura = 0.7,
                        categoria = Categoria.SEED,
                        habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray()
                    )
                )
            }
        }
    }
}
