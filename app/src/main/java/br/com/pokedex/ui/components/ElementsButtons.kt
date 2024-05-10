package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.pokedex.R
import br.com.pokedex.model.GeneticButtonProperties
import br.com.pokedex.ui.theme.PokedexTheme

@Composable
fun ElementWaterButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_water),
            text = "Água",
            backgroundColor = Color(0xFF5090D6),
        )
    )
}

@Composable
fun ElementDragonButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_dragon),
            text = "Dragão",
            backgroundColor = Color(0xFF0B6DC3),
        )
    )
}

@Composable
fun ElementElectricButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_electric),
            text = "Elétrico",
            backgroundColor = Color(0xFFFFD740),
        )
    )
}

@Composable
fun ElementFairyButtom(){
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_fairy),
            text = "Fada",
            backgroundColor = Color(0xFFEC8FE6),
        )
    )
}

@Composable
fun ElementFireButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_fire),
            text = "Fogo",
            backgroundColor = Color(0xFFFF9D55),
        )
    )
}

@Composable
fun ElementGrassButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_grass),
            text = "Grama",
            backgroundColor = Color(0xFF63BC5A),
        )
    )
}

@Composable
fun ElementGhostButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_ghost),
            text = "Fantasma",
            backgroundColor = Color(0xFF5269AD),
        )
    )
}

@Composable
fun ElementIceButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_ice),
            text = "Gelo",
            backgroundColor = Color(0xFF7DCEE9),
        )
    )
}

@Composable
fun ElementInsectButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_insect),
            text = "Inseto",
            backgroundColor = Color(0xFF91C12F),
        )
    )
}

@Composable
fun ElementFighterButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_fighter),
            text = "Lutador",
            backgroundColor = Color(0xFFCE416B),
        )
    )
}

@Composable
fun ElementNormalButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_normal),
            text = "Normal",
            backgroundColor = Color(0xFF939393),
        )
    )
}

@Composable
fun ElementNocturnalButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_nocturnal),
            text = "Nocturno",
            backgroundColor = Color(0xFF5A5465),
        )
    )
}

@Composable
fun ElementMetalButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_metal),
            text = "Metal",
            backgroundColor = Color(0xFF5A8EA2),
        )
    )
}

@Composable
fun ElementStoneButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_stone),
            text = "Pedra",
            backgroundColor = Color(0xFFC5B78C),
        )
    )
}

@Composable
fun ElementPsychicButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_psychic),
            text = "Psíquico",
            backgroundColor = Color(0xFFF96464),
        )
    )
}

@Composable
fun ElementPoisonButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_poison),
            text = "Veneno",
            backgroundColor = Color(0xFFB567CE),
        )
    )
}

@Composable
fun ElementTerrestrialButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_terrestrial),
            text = "Terrestre",
            backgroundColor = Color(0xFFD97845),
        )
    )
}

@Composable
fun ElementFlyingButton() {
    GenericButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_flying),
            text = "Voador",
            backgroundColor = Color(0xFF89AAE3),
        )
    )
}

@Composable
fun ElementWaterButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_water),
            backgroundColor = Color(0xFF5090D6),
        )
    )
}

@Composable
fun ElementDragonButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_dragon),
            backgroundColor = Color(0xFF0B6DC3),
        )
    )
}

@Composable
fun ElementElectricButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_electric),
            backgroundColor = Color(0xFFFFD740),
        )
    )
}

@Composable
fun ElementFairyButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_fairy),
            backgroundColor = Color(0xFFEC8FE6),
        )
    )
}

@Composable
fun ElementFireButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_fire),
            backgroundColor = Color(0xFFFF9D55),
        )
    )
}

@Composable
fun ElementGrassButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_grass),
            backgroundColor = Color(0xFF63BC5A),
        )
    )
}

@Composable
fun ElementGhostButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_ghost),
            backgroundColor = Color(0xFF5269AD),
        )
    )
}

@Composable
fun ElementIceButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_ice),
            backgroundColor = Color(0xFF7DCEE9),
        )
    )
}

@Composable
fun ElementInsectButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_insect),
            backgroundColor = Color(0xFF91C12F),
        )
    )
}

@Composable
fun ElementFighterButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_fighter),
            backgroundColor = Color(0xFFCE416B),
        )
    )
}

@Composable
fun ElementNormalButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_normal),
            backgroundColor = Color(0xFF939393),
        )
    )
}

@Composable
fun ElementNocturnalButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_nocturnal),
            backgroundColor = Color(0xFF5A5465),
        )
    )
}

@Composable
fun ElementMetalButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_metal),
            backgroundColor = Color(0xFF5A8EA2),
        )
    )
}

@Composable
fun ElementStoneButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_stone),
            backgroundColor = Color(0xFFC5B78C),
        )
    )
}

@Composable
fun ElementPsychicButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_psychic),
            backgroundColor = Color(0xFFF96464),
        )
    )
}

@Composable
fun ElementPoisonButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_poison),
            backgroundColor = Color(0xFFB567CE),
        )
    )
}

@Composable
fun ElementTerrestrialButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_terrestrial),
            backgroundColor = Color(0xFFD97845),
        )
    )
}

@Composable
fun ElementFlyingButtonSmall() {
    ElementEvolutionButton(
        properties = GeneticButtonProperties(
            icon = painterResource(id = R.drawable.ic_flying),
            backgroundColor = Color(0xFF89AAE3),
        )
    )
}

@Preview
@Composable
private fun ElementsButtonPreview() {
    PokedexTheme {
        Surface {
            Column {
                ElementWaterButton()
                ElementDragonButton()
                ElementFireButton()
                ElementElectricButton()
                ElementFairyButtom()
                ElementGhostButton()
                ElementGrassButton()
                ElementIceButton()
                ElementInsectButton()
                ElementFighterButton()
                ElementNormalButton()
                ElementNocturnalButton()
                ElementMetalButton()
                ElementStoneButton()
                ElementPsychicButton()
                ElementPoisonButton()
                ElementTerrestrialButton()
                ElementFlyingButton()
            }
        }
    }
}