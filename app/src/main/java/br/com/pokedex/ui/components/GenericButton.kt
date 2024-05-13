package br.com.pokedex.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GenericButton(text: String,  onClick: () -> Unit) {
    Button(
        onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp)
    ) {
        Text(
            text = text,
            fontSize = 18.sp
        )
    }
}