package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.pokedex.R
import br.com.pokedex.model.ElementGenericButtonProperties
import br.com.pokedex.ui.theme.PokedexTheme

@Composable
fun ElementWaterButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_water),
            text = "Água",
            backgroundColor = Color(0xFF5090D6),
        )
    )
}

@Composable
fun ElementDragonButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_dragon),
            text = "Dragão",
            backgroundColor = Color(0xFF0B6DC3),
        )
    )
}

@Composable
fun ElementElectricButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_electric),
            text = "Elétrico",
            backgroundColor = Color(0xFFFFD740),
        )
    )
}

@Composable
fun ElementFairyButtom(){
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fairy),
            text = "Fada",
            backgroundColor = Color(0xFFEC8FE6),
        )
    )
}

@Composable
fun ElementFireButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fire),
            text = "Fogo",
            backgroundColor = Color(0xFFFF9D55),
        )
    )
}

@Composable
fun ElementGrassButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_grass),
            text = "Grama",
            backgroundColor = Color(0xFF63BC5A),
        )
    )
}

@Composable
fun ElementGhostButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ghost),
            text = "Fantasma",
            backgroundColor = Color(0xFF5269AD),
        )
    )
}

@Composable
fun ElementIceButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ice),
            text = "Gelo",
            backgroundColor = Color(0xFF7DCEE9),
        )
    )
}

@Composable
fun ElementInsectButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_insect),
            text = "Inseto",
            backgroundColor = Color(0xFF91C12F),
        )
    )
}

@Composable
fun ElementFighterButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fighter),
            text = "Lutador",
            backgroundColor = Color(0xFFCE416B),
        )
    )
}

@Composable
fun ElementNormalButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_normal),
            text = "Normal",
            backgroundColor = Color(0xFF939393),
        )
    )
}

@Composable
fun ElementNocturnalButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_nocturnal),
            text = "Nocturno",
            backgroundColor = Color(0xFF5A5465),
        )
    )
}

@Composable
fun ElementMetalButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_metal),
            text = "Metal",
            backgroundColor = Color(0xFF5A8EA2),
        )
    )
}

@Composable
fun ElementStoneButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_stone),
            text = "Pedra",
            backgroundColor = Color(0xFFC5B78C),
        )
    )
}

@Composable
fun ElementPsychicButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_psychic),
            text = "Psíquico",
            backgroundColor = Color(0xFFF96464),
        )
    )
}

@Composable
fun ElementPoisonButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_poison),
            text = "Veneno",
            backgroundColor = Color(0xFFB567CE),
        )
    )
}

@Composable
fun ElementTerrestrialButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_terrestrial),
            text = "Terrestre",
            backgroundColor = Color(0xFFD97845),
        )
    )
}

@Composable
fun ElementFlyingButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_flying),
            text = "Voador",
            backgroundColor = Color(0xFF89AAE3),
        )
    )
}

@Composable
fun ElementWaterButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_water),
            backgroundColor = Color(0xFF5090D6),
        )
    )
}

@Composable
fun ElementDragonButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_dragon),
            backgroundColor = Color(0xFF0B6DC3),
        )
    )
}

@Composable
fun ElementElectricButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_electric),
            backgroundColor = Color(0xFFFFD740),
        )
    )
}

@Composable
fun ElementFairyButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fairy),
            backgroundColor = Color(0xFFEC8FE6),
        )
    )
}

@Composable
fun ElementFireButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fire),
            backgroundColor = Color(0xFFFF9D55),
        )
    )
}

@Composable
fun ElementGrassButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_grass),
            backgroundColor = Color(0xFF63BC5A),
        )
    )
}

@Composable
fun ElementGhostButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ghost),
            backgroundColor = Color(0xFF5269AD),
        )
    )
}

@Composable
fun ElementIceButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ice),
            backgroundColor = Color(0xFF7DCEE9),
        )
    )
}

@Composable
fun ElementInsectButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_insect),
            backgroundColor = Color(0xFF91C12F),
        )
    )
}

@Composable
fun ElementFighterButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fighter),
            backgroundColor = Color(0xFFCE416B),
        )
    )
}

@Composable
fun ElementNormalButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_normal),
            backgroundColor = Color(0xFF939393),
        )
    )
}

@Composable
fun ElementNocturnalButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_nocturnal),
            backgroundColor = Color(0xFF5A5465),
        )
    )
}

@Composable
fun ElementMetalButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_metal),
            backgroundColor = Color(0xFF5A8EA2),
        )
    )
}

@Composable
fun ElementStoneButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_stone),
            backgroundColor = Color(0xFFC5B78C),
        )
    )
}

@Composable
fun ElementPsychicButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_psychic),
            backgroundColor = Color(0xFFF96464),
        )
    )
}

@Composable
fun ElementPoisonButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_poison),
            backgroundColor = Color(0xFFB567CE),
        )
    )
}

@Composable
fun ElementTerrestrialButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_terrestrial),
            backgroundColor = Color(0xFFD97845),
        )
    )
}

@Composable
fun ElementFlyingButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
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