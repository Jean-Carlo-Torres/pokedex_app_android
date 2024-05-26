package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
import br.com.pokedex.ui.activity.ui.theme.ElementSteelColor
import br.com.pokedex.ui.activity.ui.theme.ElementRockColor
import br.com.pokedex.ui.activity.ui.theme.ElementWaterColor
import br.com.pokedex.ui.activity.ui.theme.Gray800

@Composable
fun PokemonType(navController: NavController?, viewModel: PokemonViewModel?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        PageHeader(
            title = "Selecione o tipo",
            onClick = {
                navController?.popBackStack()
            }
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ButtonTypeDefault(text = "Todos os tipos", bgColor = Gray800, onClick = {
                viewModel?.selectedElementType = null
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Água", bgColor = ElementWaterColor, onClick = {
                viewModel?.selectedElementType = ElementTag.WATER
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Dragão", bgColor = ElementDragonColor, onClick = {
                viewModel?.selectedElementType = ElementTag.DRAGON
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Elétrico", bgColor = ElementElectricColor, onClick = {
                viewModel?.selectedElementType = ElementTag.ELECTRIC
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Fada", bgColor = ElementFairyColor, onClick = {
                viewModel?.selectedElementType = ElementTag.FAIRY
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Fantasma", bgColor = ElementGhostColor, onClick = {
                viewModel?.selectedElementType = ElementTag.GHOST
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Fogo", bgColor = ElementFireColor, onClick = {
                viewModel?.selectedElementType = ElementTag.FIRE
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Gelo", bgColor = ElementIceColor, onClick = {
                viewModel?.selectedElementType = ElementTag.ICE
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Grama", bgColor = ElementGrassColor, onClick = {
                viewModel?.selectedElementType = ElementTag.GRASS
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Inseto", bgColor = ElementBugColor, onClick = {
                viewModel?.selectedElementType = ElementTag.BUG
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Lutador", bgColor = ElementFightColor, onClick = {
                viewModel?.selectedElementType = ElementTag.FIGHTING
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Normal", bgColor = ElementNormalColor, onClick = {
                viewModel?.selectedElementType = ElementTag.NORMAL
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Noturno", bgColor = ElementDarkColor, onClick = {
                viewModel?.selectedElementType = ElementTag.DARK
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Metal", bgColor = ElementSteelColor, onClick = {
                viewModel?.selectedElementType = ElementTag.STEEL
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Pedra", bgColor = ElementRockColor, onClick = {
                viewModel?.selectedElementType = ElementTag.ROCK
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Psíquico", bgColor = ElementPsychicColor, onClick = {
                viewModel?.selectedElementType = ElementTag.PSYCHIC
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Terrestre", bgColor = ElementGroundColor, onClick = {
                viewModel?.selectedElementType = ElementTag.GROUND
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Venenoso", bgColor = ElementPoisonColor, onClick = {
                viewModel?.selectedElementType = ElementTag.POISON
                navController?.popBackStack()
            })
            ButtonTypeDefault(text = "Voador", bgColor = ElementFlyingColor, onClick = {
                viewModel?.selectedElementType = ElementTag.FLYING
                navController?.popBackStack()
            })
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
private fun ButtonTypeDefault(text: String, bgColor: Color, onClick: () -> Unit = {}) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(42.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = bgColor,
            contentColor = Color.White
        )
    ) {
        Text(
            text = text,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PokemonTypePreview() {
    PokemonType(navController = null, viewModel = null)
}