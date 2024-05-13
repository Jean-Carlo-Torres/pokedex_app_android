package br.com.pokedex.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.R
import br.com.pokedex.ui.components.GenericButton

@Composable
fun OnboardingScreen() {
    var currentPage by remember { mutableStateOf(0) }

    val onNext: () -> Unit = { currentPage++ }

    when (currentPage) {
        0 -> {
            Onboarding1(onNext)
        }
        1 -> {
            Onboarding2(onNext)
        }
        2 -> {
            Onboarding3 {}
        }
    }
}

@Composable
fun Onboarding1(onNext: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        padraoImagem(painterResource(id = R.drawable.image134))
        padraoTextoPrimario("Todos os Pokémons em um só Lugar")
        padraoTextoSecundario("Acesse uma vasta lista de Pokémon de todas as gerações já feitas pela Nintendo")
        GenericButton("Continuar", onClick = onNext)
    }
}

@Composable
fun Onboarding2(onNext: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        padraoImagem(imagem = painterResource(id = R.drawable.sprite_hilda))
        padraoTextoPrimario("Mantenha sua Pokédex atualizada")
        padraoTextoSecundario("Cadastre-se e mantenha seu perfil, pokémon favoritos, configurações e muito mais, salvos no aplicativo, mesmo sem conexão com a internet.")
        GenericButton("Vamos começar!", onClick = onNext)
    }
}

@Composable
fun Onboarding3(onNext: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        padraoImagem(imagem = painterResource(id = R.drawable.trainers))
        padraoTextoPrimario("Está pronto para essa aventura?")
        padraoTextoSecundario("Basta criar uma conta e começar a explorar o mundo dos Pokémon hoje!")
        GenericButton("Criar conta", onClick = onNext)
    }
}


@Composable
private fun padraoTextoSecundario(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(
                top = 8.dp,
                bottom = 32.dp
            )
    )
}

@Composable
private fun padraoTextoPrimario(text: String) {
    Text(
        text = text,
        fontSize = 26.sp,
        fontWeight = FontWeight(500),
        textAlign = TextAlign.Center
    )
}

@Composable
private fun padraoImagem(imagem: Painter) {
    Image(
        painter = imagem,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(320.dp)
            .padding(bottom = 16.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun OnboardingScreenPreview() {
    // Onboarding1()
    // Onboarding2()
    // Onboarding3()
}