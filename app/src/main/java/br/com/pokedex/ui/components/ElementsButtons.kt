package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.pokedex.R
import br.com.pokedex.model.ElementGenericButtonProperties
import br.com.pokedex.ui.activity.ui.theme.ElementBugColor
import br.com.pokedex.ui.activity.ui.theme.ElementDarkColor
import br.com.pokedex.ui.activity.ui.theme.ElementDragonColor
import br.com.pokedex.ui.activity.ui.theme.ElementElectricColor
import br.com.pokedex.ui.activity.ui.theme.ElementFairyColor
import br.com.pokedex.ui.activity.ui.theme.ElementFightColor
import br.com.pokedex.ui.activity.ui.theme.ElementFireColor
import br.com.pokedex.ui.activity.ui.theme.ElementFlyingColor
import br.com.pokedex.ui.activity.ui.theme.ElementGhostColor
import br.com.pokedex.ui.activity.ui.theme.ElementGrassColor
import br.com.pokedex.ui.activity.ui.theme.ElementGroundColor
import br.com.pokedex.ui.activity.ui.theme.ElementIceColor
import br.com.pokedex.ui.activity.ui.theme.ElementNormalColor
import br.com.pokedex.ui.activity.ui.theme.ElementPoisonColor
import br.com.pokedex.ui.activity.ui.theme.ElementPsychicColor
import br.com.pokedex.ui.activity.ui.theme.ElementRockColor
import br.com.pokedex.ui.activity.ui.theme.ElementSteelColor
import br.com.pokedex.ui.activity.ui.theme.ElementWaterColor
import br.com.pokedex.ui.theme.PokedexTheme

@Composable
fun ElementWaterButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_water),
            text = "Água",
            backgroundColor = ElementWaterColor,
        )
    )
}

@Composable
fun ElementDragonButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_dragon),
            text = "Dragão",
            backgroundColor = ElementDragonColor,
        )
    )
}

@Composable
fun ElementElectricButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_electric),
            text = "Elétrico",
            backgroundColor = ElementElectricColor,
        )
    )
}

@Composable
fun ElementFairyButtom(){
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fairy),
            text = "Fada",
            backgroundColor = ElementFairyColor,
        )
    )
}

@Composable
fun ElementFireButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fire),
            text = "Fogo",
            backgroundColor = ElementFireColor,
        )
    )
}

@Composable
fun ElementGrassButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_grass),
            text = "Grama",
            backgroundColor = ElementGrassColor,
        )
    )
}

@Composable
fun ElementGhostButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ghost),
            text = "Fantasma",
            backgroundColor = ElementGhostColor,
        )
    )
}

@Composable
fun ElementIceButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ice),
            text = "Gelo",
            backgroundColor = ElementIceColor,
        )
    )
}

@Composable
fun ElementBugButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_bug),
            text = "Inseto",
            backgroundColor = ElementBugColor,
        )
    )
}

@Composable
fun ElementFighterButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fighter),
            text = "Lutador",
            backgroundColor = ElementFightColor,
        )
    )
}

@Composable
fun ElementNormalButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_normal),
            text = "Normal",
            backgroundColor = ElementNormalColor,
        )
    )
}

@Composable
fun ElementDarkButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_dark),
            text = "Nocturno",
            backgroundColor = ElementDarkColor,
        )
    )
}

@Composable
fun ElementMetalButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_metal),
            text = "Metal",
            backgroundColor = ElementSteelColor,
        )
    )
}

@Composable
fun ElementRockButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_rock),
            text = "Pedra",
            backgroundColor = ElementRockColor,
        )
    )
}

@Composable
fun ElementPsychicButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_psychic),
            text = "Psíquico",
            backgroundColor = ElementPsychicColor,
        )
    )
}

@Composable
fun ElementPoisonButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_poison),
            text = "Veneno",
            backgroundColor = ElementPoisonColor,
        )
    )
}

@Composable
fun ElementGroundButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ground),
            text = "Terrestre",
            backgroundColor = ElementGroundColor,
        )
    )
}

@Composable
fun ElementFlyingButton() {
    ElementGenericButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_flying),
            text = "Voador",
            backgroundColor = ElementFlyingColor,
        )
    )
}

@Composable
fun ElementWaterButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_water),
            backgroundColor = ElementWaterColor,
        )
    )
}

@Composable
fun ElementDragonButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_dragon),
            backgroundColor = ElementDragonColor,
        )
    )
}

@Composable
fun ElementElectricButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_electric),
            backgroundColor = ElementElectricColor,
        )
    )
}

@Composable
fun ElementFairyButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fairy),
            backgroundColor = ElementFairyColor,
        )
    )
}

@Composable
fun ElementFireButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fire),
            backgroundColor = ElementFireColor,
        )
    )
}

@Composable
fun ElementGrassButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_grass),
            backgroundColor = ElementGrassColor,
        )
    )
}

@Composable
fun ElementGhostButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ghost),
            backgroundColor = ElementGhostColor,
        )
    )
}

@Composable
fun ElementIceButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ice),
            backgroundColor = ElementIceColor,
        )
    )
}

@Composable
fun ElementBugButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_bug),
            backgroundColor = ElementBugColor,
        )
    )
}

@Composable
fun ElementFighterButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_fighter),
            backgroundColor = ElementFightColor,
        )
    )
}

@Composable
fun ElementNormalButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_normal),
            backgroundColor = ElementNormalColor,
        )
    )
}

@Composable
fun ElementDarkButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_dark),
            backgroundColor = ElementDarkColor,
        )
    )
}

@Composable
fun ElementMetalButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_metal),
            backgroundColor = ElementSteelColor,
        )
    )
}

@Composable
fun ElementRockButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_rock),
            backgroundColor = ElementRockColor,
        )
    )
}

@Composable
fun ElementPsychicButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_psychic),
            backgroundColor = ElementPsychicColor,
        )
    )
}

@Composable
fun ElementPoisonButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_poison),
            backgroundColor = ElementPoisonColor,
        )
    )
}

@Composable
fun ElementGroundButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_ground),
            backgroundColor = ElementGroundColor,
        )
    )
}

@Composable
fun ElementFlyingButtonSmall() {
    ElementEvolutionButton(
        properties = ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_flying),
            backgroundColor = ElementFlyingColor,
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
                ElementBugButton()
                ElementFighterButton()
                ElementNormalButton()
                ElementDarkButton()
                ElementMetalButton()
                ElementRockButton()
                ElementPsychicButton()
                ElementPoisonButton()
                ElementGroundButton()
                ElementFlyingButton()
            }
        }
    }
}