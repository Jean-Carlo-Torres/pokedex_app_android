package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pokedex.R
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.ui.components.BackgroundElectric
import br.com.pokedex.ui.components.BackgroundFairy
import br.com.pokedex.ui.components.BackgroundFire
import br.com.pokedex.ui.components.BackgroundGrass
import br.com.pokedex.ui.components.BackgroundInsect
import br.com.pokedex.ui.components.BackgroundNormal
import br.com.pokedex.ui.components.BackgroundPoison
import br.com.pokedex.ui.components.BackgroundPsychic
import br.com.pokedex.ui.components.BackgroundStone
import br.com.pokedex.ui.components.BackgroundTerrestrial
import br.com.pokedex.ui.components.BackgroundWater
import br.com.pokedex.ui.components.ElementElectricButtonSmall
import br.com.pokedex.ui.components.ElementFairyButtonSmall
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementInsectButton
import br.com.pokedex.ui.components.ElementNormalButtonSmall
import br.com.pokedex.ui.components.ElementPoisonButton
import br.com.pokedex.ui.components.ElementPoisonButtonSmall
import br.com.pokedex.ui.components.ElementPsychicButtonSmall
import br.com.pokedex.ui.components.ElementStoneButtonSmall
import br.com.pokedex.ui.components.ElementTerrestrialButtonSmall
import br.com.pokedex.ui.components.ElementWaterButtonSmall
import br.com.pokedex.ui.components.ListaCardPokemon

@Composable
fun ListaPokemonScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
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

@Composable
fun BulbasaurListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.bulbasaur),
        nome = "Bulbasaur",
        numero = "001",
        background = BackgroundGrass(),
        element = listOf(
            { ElementGrassButton() },
            { ElementPoisonButton() }
        )
    )
}

@Composable
fun IvysaurListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.ivysaur),
        nome = "Ivysaur",
        numero = "002",
        background = BackgroundGrass(),
        element = listOf(
            { ElementGrassButton() },
            { ElementPoisonButton() }
        )
    )
}

@Composable
fun VenusaurListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.venusaur),
        nome = "Venusaur",
        numero = "003",
        background = BackgroundGrass(),
        element = listOf(
            { ElementGrassButton() },
            { ElementPoisonButton() }
        )
    )
}

@Composable
fun CharmanderListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.charmander),
        nome = "Charmander",
        numero = "004",
        element = listOf { ElementFireButton() },
        background = BackgroundFire()
    )
}

@Composable
fun CharmeleonListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.charmeleon),
        nome = "Charmeleon",
        numero = "005",
        element = listOf { ElementFireButton() },
        background = BackgroundFire()
    )
}

@Composable
fun CharizardListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.charizard),
        nome = "Charizard",
        numero = "006",
        element = listOf(
            { ElementFireButton() },
            { ElementFlyingButton() }
        ),
        background = BackgroundFire()
    )
}

@Composable
fun SquirtleListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.squirtle),
        background = BackgroundWater(),
        nome = "Squirtle",
        numero = "007",
        element = listOf { ElementWaterButtonSmall() }
    )
}

@Composable
fun WartortleListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.wartortle),
        background = BackgroundWater(),
        nome = "Wartortle",
        numero = "008",
        element = listOf { ElementWaterButtonSmall() }
    )
}

@Composable
fun BlastoiseListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.blastoise),
        background = BackgroundWater(),
        nome = "Blastoise",
        numero = "009",
        element = listOf { ElementWaterButtonSmall() }
    )
}

@Composable
fun BeedrillListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.beedrill),
        nome = "Beedrill",
        numero = "015",
        element = listOf(
            { ElementInsectButton() },
            { ElementPoisonButton() }
        ),
        background = BackgroundInsect(),
    )
}

@Composable
fun PikachuListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.pikachu),
        background = BackgroundElectric(),
        nome = "Pikachu",
        numero = "025",
        element = listOf { ElementElectricButtonSmall() }
    )
}

@Composable
fun CleifairyListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.clefairy),
        background = BackgroundFairy(),
        nome = "Clefairy",
        numero = "035",
        element = listOf { ElementFairyButtonSmall() }
    )
}

@Composable
fun DugtrioListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.dugtrio),
        background = BackgroundTerrestrial(),
        nome = "Dugtrio",
        numero = "051",
        element = listOf { ElementTerrestrialButtonSmall() }
    )
}

@Composable
fun OnixListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.onix),
        background = BackgroundStone(),
        nome = "Onix",
        numero = "095",
        element = listOf(
            { ElementStoneButtonSmall() },
            { ElementTerrestrialButtonSmall() },
        )
    )
}

@Composable
fun LickitungListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.lickitung),
        background = BackgroundNormal(),
        nome = "Lickitung",
        numero = "108",
        element = listOf { ElementNormalButtonSmall() }
    )
}

@Composable
fun KoffingListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.koffing),
        background = BackgroundPoison(),
        nome = "Koffing",
        numero = "109",
        element = listOf { ElementPoisonButtonSmall() }
    )
}

@Composable
fun MewListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = painterResource(id = R.drawable.mew),
        background = BackgroundPsychic(),
        nome = "Mew",
        numero = "151",
        element = listOf { ElementPsychicButtonSmall() }
    )
}

@Preview(showBackground = true)
@Composable
private fun ListaPokemonScreenPreview() {
    ListaPokemonScreen()
}