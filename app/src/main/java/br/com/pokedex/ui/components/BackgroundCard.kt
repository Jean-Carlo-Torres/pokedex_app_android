package br.com.pokedex.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R
import br.com.pokedex.ui.activity.ui.theme.ElementBugColor
import br.com.pokedex.ui.activity.ui.theme.ElementElectricColor
import br.com.pokedex.ui.activity.ui.theme.ElementFairyColor
import br.com.pokedex.ui.activity.ui.theme.ElementFireColor
import br.com.pokedex.ui.activity.ui.theme.ElementGrassColor
import br.com.pokedex.ui.activity.ui.theme.ElementGroundColor
import br.com.pokedex.ui.activity.ui.theme.ElementNormalColor
import br.com.pokedex.ui.activity.ui.theme.ElementPoisonColor
import br.com.pokedex.ui.activity.ui.theme.ElementPsychicColor
import br.com.pokedex.ui.activity.ui.theme.ElementRockColor
import br.com.pokedex.ui.activity.ui.theme.ElementWaterColor

data class BackgroundCard(
    val backgroundColor: Color,
    val icone: Painter
)

@Composable
fun BackgroundGrass(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementGrassColor,
        icone = painterResource(R.drawable.element_grass_outline)
    )
}

@Composable
fun BackgroundWater(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementWaterColor,
        icone = painterResource(R.drawable.element_water_outline)
    )
}

@Composable
fun BackgroundFire(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementFireColor,
        icone = painterResource(R.drawable.element_fire_outline)
    )
}

@Composable
fun BackgroundElectric(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementElectricColor,
        icone = painterResource(R.drawable.element_electric_outline)
    )
}

@Composable
fun BackgroundFairy(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementFairyColor,
        icone = painterResource(R.drawable.element_fairy_outline)
    )
}

@Composable
fun BackgroundInsect(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementBugColor,
        icone = painterResource(R.drawable.element_bug_outline)
    )
}

@Composable
fun BackgroundNormal(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementNormalColor,
        icone = painterResource(R.drawable.element_normal_outline)
    )
}

@Composable
fun BackgroundPoison(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementPoisonColor,
        icone = painterResource(R.drawable.element_poison_outline)
    )
}

@Composable
fun BackgroundStone(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementRockColor,
        icone = painterResource(R.drawable.element_rock_outline)
    )
}

@Composable
fun BackgroundPsychic(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementPsychicColor,
        icone = painterResource(R.drawable.element_psychic_outline)
    )
}

@Composable
fun BackgroundTerrestrial(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = ElementGroundColor,
        icone = painterResource(R.drawable.element_ground_outline)
    )
}