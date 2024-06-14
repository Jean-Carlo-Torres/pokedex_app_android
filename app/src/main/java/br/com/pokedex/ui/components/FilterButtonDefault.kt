package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.pokedex.model.PokemonViewModel
import br.com.pokedex.model.enums.ElementTag
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
import br.com.pokedex.ui.activity.ui.theme.ElementMetalColor
import br.com.pokedex.ui.activity.ui.theme.ElementWaterColor
import br.com.pokedex.ui.activity.ui.theme.Gray800

@Composable
fun FilterElementType(navController: NavController?, viewModel: PokemonViewModel) {
    val selectedElementType = viewModel.selectedElementType
    val text = when (selectedElementType != null) {
        true -> selectedElementType.descricao
        false -> "Todos os tipos"
    }
    val elementColorMap = mapOf(
        ElementTag.BUG to ElementBugColor,
        ElementTag.DARK to ElementDarkColor,
        ElementTag.DRAGON to ElementDragonColor,
        ElementTag.ELECTRIC to ElementElectricColor,
        ElementTag.FAIRY to ElementFairyColor,
        ElementTag.FIGHTING to ElementFightColor,
        ElementTag.FIRE to ElementFireColor,
        ElementTag.FLYING to ElementFlyingColor,
        ElementTag.GHOST to ElementGhostColor,
        ElementTag.GRASS to ElementGrassColor,
        ElementTag.GROUND to ElementGroundColor,
        ElementTag.ICE to ElementIceColor,
        ElementTag.NORMAL to ElementNormalColor,
        ElementTag.POISON to ElementPoisonColor,
        ElementTag.PSYCHIC to ElementPsychicColor,
        ElementTag.ROCK to ElementRockColor,
        ElementTag.METAL to ElementMetalColor,
        ElementTag.WATER to ElementWaterColor
    )

    val containerColor = when {
        selectedElementType == null -> Gray800
        else -> elementColorMap[selectedElementType] ?: Gray800
    }

    FilterButtonDefault(
        navController,
        text,
        containerColor,
        onClick = {
            navController?.navigate("pokemonType")
        }
    )
}

@Composable
fun SortListPokemon(navController: NavController?, viewModel: PokemonViewModel) {
    val text = when (viewModel.sortedListIndex) {
        1 -> "Menor número"
        2 -> "Maior número"
        3 -> "A-Z"
        4 -> "Z-A"
        else -> "Ordenar"
    }
    FilterButtonDefault(
        navController,
        text,
        onClick = {
            navController?.navigate("sortListItems")
        }
    )
}

@Composable
fun FilterButtonDefault(
    navController: NavController?,
    text: String,
    containerColor: Color = Gray800,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .widthIn(min = 156.dp)
            .height(42.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = Color.White
        )
    ) {
        Text(text = text)
        Icon(
            imageVector = Icons.Default.KeyboardArrowDown,
            contentDescription = null
        )
    }
}