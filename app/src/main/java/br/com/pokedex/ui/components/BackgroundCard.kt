package br.com.pokedex.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import br.com.pokedex.R

data class BackgroundCard(
    val backgroundColor: Color,
    val icone: Painter
)

@Composable
fun BackgroundGrass(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFF63BC5A),
        icone = painterResource(R.drawable.element_grass_outline)
    )
}

@Composable
fun BackgroundWater(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFF5090D6),
        icone = painterResource(R.drawable.element_water_outline)
    )
}

@Composable
fun BackgroundFire(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFFFF9D55),
        icone = painterResource(R.drawable.element_fire_outline)
    )
}

@Composable
fun BackgroundElectric(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFFFFD740),
        icone = painterResource(R.drawable.element_electric_outline)
    )
}

@Composable
fun BackgroundFairy(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFFEC8FE6),
        icone = painterResource(R.drawable.element_fairy_outline)
    )
}

@Composable
fun BackgroundInsect(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFF91C12F),
        icone = painterResource(R.drawable.element_insect_outline)
    )
}

@Composable
fun BackgroundNormal(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFF939393),
        icone = painterResource(R.drawable.element_normal_outline)
    )
}

@Composable
fun BackgroundPoison(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFFB567CE),
        icone = painterResource(R.drawable.element_poison_outline)
    )
}

@Composable
fun BackgroundStone(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFFC5B78C),
        icone = painterResource(R.drawable.element_stone_outline)
    )
}

@Composable
fun BackgroundPsychic(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFFF96464),
        icone = painterResource(R.drawable.element_psychic_outline)
    )
}

@Composable
fun BackgroundTerrestrial(): BackgroundCard {
    return BackgroundCard(
        backgroundColor = Color(0xFFD97845),
        icone = painterResource(R.drawable.element_terrestrial_outline)
    )
}