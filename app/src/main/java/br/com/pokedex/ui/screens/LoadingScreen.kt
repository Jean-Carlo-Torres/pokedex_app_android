package br.com.pokedex.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoadingScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF000029)),
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator(color = Color.Red)
    }
}

@Preview
@Composable
private fun LoadingScreenPreview() {
    LoadingScreen()
}