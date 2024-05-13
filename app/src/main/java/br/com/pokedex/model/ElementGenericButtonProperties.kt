package br.com.pokedex.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter

data class ElementGenericButtonProperties(
    val icon: Painter,
    val text: String,
    val backgroundColor: Color,
    val contentColor: Color = Color.White
) {
    constructor(icon: Painter, backgroundColor: Color, contentColor: Color = Color.White) :
            this(icon, "", backgroundColor, contentColor)
}
