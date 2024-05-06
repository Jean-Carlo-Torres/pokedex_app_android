package br.com.pokedex.model

import android.media.Image
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class GeneticButtonProperties (
    val icon: Painter,
    val text: String,
    val backgroundColor: Color,
    val contentColor: Color = Color.White
)