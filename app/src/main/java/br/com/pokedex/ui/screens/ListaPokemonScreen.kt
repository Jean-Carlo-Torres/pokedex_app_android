package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.pokedex.ui.components.ListaCardPokemon
import br.com.pokedex.ui.components.cards.*

@Composable
fun ListaPokemonScreen(navController: NavController?) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        val pokemonList = listOf(
            BulbasaurListData(),
            IvysaurListData(),
            VenusaurListData(),
            CharmanderListData(),
            CharmeleonListData(),
            CharizardListData(),
            SquirtleListData(),
            WartortleListData(),
            BlastoiseListData(),
            BeedrillListData(),
            PikachuListData(),
            CleifairyListData(),
            DugtrioListData(),
            OnixListData(),
            LickitungListData(),
            KoffingListData(),
            MewListData()
        )

        pokemonList.forEachIndexed { index, pokemon ->
            ListaCardPokemon(pokemon = pokemon, onClick = {
                navController?.navigate("cardPokemonScreen/$index")
            })
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ListaPokemonScreenPreview() {
    ListaPokemonScreen(navController = null)
}