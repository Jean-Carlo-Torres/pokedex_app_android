package br.com.pokedex.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pokedex.R

@Composable
fun SplashScreen() {
    val logo = painterResource(id = R.drawable.logo_pokedex)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF000029)),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = logo,
            contentDescription = null,
            modifier = Modifier
                .width(192.dp)
                .height(71.dp)
        )
    }
}

@Preview
@Composable
private fun SplashScreenPreview() {
    SplashScreen()
}

