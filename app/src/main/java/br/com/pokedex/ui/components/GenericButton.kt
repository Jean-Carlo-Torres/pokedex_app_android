package br.com.pokedex.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.R

@Composable
fun GenericButton(text: String, onClick: () -> Unit) {
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

@Composable
fun GenericNoFillButton(imagem: Painter, text: String) {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.Unspecified
        ),
        border = BorderStroke(
            1.dp,
            Color.Black
        ),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        Icon(
            painter = imagem,
            contentDescription = null,
            modifier = Modifier
                .width(42.dp)
                .height(42.dp)
                .padding(horizontal = 8.dp)
        )
        Text(
            text = text,
            fontSize = 18.sp
        )
    }
}

@Composable
fun GoogleNoFillButton() {
    GenericNoFillButton(
        imagem = painterResource(id = R.drawable.ic_google),
        text = "Continuar com o Google"
    )
}

@Composable
fun AppleNoFillButton() {
    GenericNoFillButton(
        imagem = painterResource(id = R.drawable.ic_apple),
        text = "Continuar com a Apple"
    )
}