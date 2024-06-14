package br.com.pokedex.ui.screens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.pokedex.R
import br.com.pokedex.ui.activity.ui.theme.Blue800
import br.com.pokedex.ui.activity.ui.theme.PokedexTheme
import br.com.pokedex.ui.components.GenericButton

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(navController: NavController?) {
    val pagerState = rememberPagerState(pageCount = { 3 })

    PokedexTheme {
        Surface {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier.weight(1f)
                ) { page ->
                    when (page) {
                        0 -> OnboardingContent(
                            imageResId = R.drawable.image134,
                            primaryText = "Todos os Pokémons em um só Lugar",
                            secondaryText = "Acesse uma vasta lista de Pokémon de todas as gerações já feitas pela Nintendo"
                        )

                        1 -> OnboardingContent(
                            imageResId = R.drawable.sprite_hilda,
                            primaryText = "Mantenha sua Pokédex atualizada",
                            secondaryText = "Cadastre-se e mantenha seu perfil, pokémon favoritos, configurações e muito mais, salvos no aplicativo, mesmo sem conexão com a internet."
                        )

                        2 -> OnboardingContent(
                            imageResId = R.drawable.trainers,
                            primaryText = "Está pronto para essa aventura?",
                            secondaryText = "Basta criar uma conta e começar a explorar o mundo dos Pokémon hoje!",
                            navController = navController
                        )
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    repeat(3) { index ->
                        val size by animateDpAsState(if (pagerState.currentPage == index) 12.dp else 8.dp)
                        val color =
                            if (pagerState.currentPage == index) Blue800 else Color.LightGray

                        Box(
                            modifier = Modifier
                                .size(size)
                                .background(color, CircleShape)
                                .padding(4.dp)
                        )
                        if (index < 2) {
                            Spacer(modifier = Modifier.width(8.dp))
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Composable
fun OnboardingContent(
    imageResId: Int,
    primaryText: String,
    secondaryText: String,
    navController: NavController? = null
) {
    PokedexTheme {
        Surface {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = 150.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 32.dp
                    ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                padraoImagem(painterResource(id = imageResId))
                padraoTextoPrimario(primaryText)
                padraoTextoSecundario(secondaryText)

                if (navController != null) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        GenericButton(text = "Criar conta", onClick = {
                            navController.navigate("formaDeCadastroScreen")
                        })
                    }
                    Text(
                        text = "Já tenho uma conta",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF173EA5),
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .clickable {
                                navController.navigate("formaDeLoginScreen")
                            }
                    )
                } else {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun padraoTextoSecundario(text: String) {
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
fun padraoTextoPrimario(text: String) {
    Text(
        text = text,
        fontSize = 26.sp,
        fontWeight = FontWeight(500),
        textAlign = TextAlign.Center
    )
}

@Composable
fun padraoImagem(imagem: Painter) {
    Image(
        painter = imagem,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 320.dp)
            .padding(bottom = 16.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun Onboarding1Preview() {
    OnboardingContent(
        imageResId = R.drawable.image134,
        primaryText = "Todos os Pokémons em um só Lugar",
        secondaryText = "Acesse uma vasta lista de Pokémon de todas as gerações já feitas pela Nintendo"
    )
}