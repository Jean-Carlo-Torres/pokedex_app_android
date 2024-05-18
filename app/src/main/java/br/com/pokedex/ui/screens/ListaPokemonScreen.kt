package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pokedex.ui.components.ListaCardPokemon
import br.com.pokedex.ui.components.cards.*

@Composable
fun ListaPokemonScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ListaCardPokemon(pokemon = BulbasaurListData())
        ListaCardPokemon(pokemon = IvysaurListData())
        ListaCardPokemon(pokemon = VenusaurListData())
        ListaCardPokemon(pokemon = CharmanderListData())
        ListaCardPokemon(pokemon = CharmeleonListData())
        ListaCardPokemon(pokemon = CharizardListData())
        ListaCardPokemon(pokemon = SquirtleListData())
        ListaCardPokemon(pokemon = WartortleListData())
        ListaCardPokemon(pokemon = BlastoiseListData())
        ListaCardPokemon(pokemon = BeedrillListData())
        ListaCardPokemon(pokemon = PikachuListData())
        ListaCardPokemon(pokemon = CleifairyListData())
        ListaCardPokemon(pokemon = DugtrioListData())
        ListaCardPokemon(pokemon = OnixListData())
        ListaCardPokemon(pokemon = LickitungListData())
        ListaCardPokemon(pokemon = KoffingListData())
        ListaCardPokemon(pokemon = MewListData())
    }
}

@Preview(showBackground = true)
@Composable
private fun ListaPokemonScreenPreview() {
    ListaPokemonScreen()
}