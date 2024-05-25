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
fun PokemonType(navController: NavController?) {
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
            ButtonTypeDefault(text = "Todos os tipos", bgColor = Gray800)
            ButtonTypeDefault(text = "Água", bgColor = ElementWaterColor)
            ButtonTypeDefault(text = "Dragão", bgColor = ElementDragonColor)
            ButtonTypeDefault(text = "Elétrico", bgColor = ElementElectricColor)
            ButtonTypeDefault(text = "Fada", bgColor = ElementFairyColor)
            ButtonTypeDefault(text = "Fantasma", bgColor = ElementGhostColor)
            ButtonTypeDefault(text = "Fogo", bgColor = ElementFireColor)
            ButtonTypeDefault(text = "Gelo", bgColor = ElementIceColor)
            ButtonTypeDefault(text = "Grama", bgColor = ElementGrassColor)
            ButtonTypeDefault(text = "Inseto", bgColor = ElementBugColor)
            ButtonTypeDefault(text = "Lutador", bgColor = ElementFightColor)
            ButtonTypeDefault(text = "Normal", bgColor = ElementNormalColor)
            ButtonTypeDefault(text = "Noturno", bgColor = ElementDarkColor)
            ButtonTypeDefault(text = "Metal", bgColor = ElementSteelColor)
            ButtonTypeDefault(text = "Pedra", bgColor = ElementRockColor)
            ButtonTypeDefault(text = "Psíquico", bgColor = ElementPsychicColor)
            ButtonTypeDefault(text = "Terrestre", bgColor = ElementGroundColor)
            ButtonTypeDefault(text = "Venenoso", bgColor = ElementPoisonColor)
            ButtonTypeDefault(text = "Voador", bgColor = ElementFlyingColor)
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
private fun ButtonTypeDefault(text: String, bgColor: Color, onClick: () -> Unit = {}) {
    Button(
        onClick = { onClick },
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
    PokemonType(navController = null)
}