package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.pokedex.model.UserViewModel
import br.com.pokedex.ui.components.CustomTextField
import br.com.pokedex.ui.components.GenericButton
import br.com.pokedex.ui.components.PageHeader
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun FormularioDeLoginScreen(navController: NavController?, userViewModel: UserViewModel?) {
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }
    var showEmailError by remember { mutableStateOf(false) }
    var showPasswordError by remember { mutableStateOf(false) }
    var loginError by remember { mutableStateOf(false) }
    var isLoading by rememberSaveable { mutableStateOf(false) }
    var showLoginSucesso by rememberSaveable { mutableStateOf(false) }

    val coroutineScope = rememberCoroutineScope()

    val isEmailValid = email.isNotBlank() && email.contains("@")
    val isPasswordValid = password.isNotBlank() && password.length >= 8

    val onLoginSuccess: () -> Unit = {
        isLoading = true
        showLoginSucesso = true
    }

    if (showLoginSucesso) {
        LaunchedEffect(Unit) {
            delay(3000)
            navController?.navigate("loginSucessoScreen") {
                popUpTo("formularioDeLoginScreen") { inclusive = true }
            }
        }
    }

    if (isLoading) {
        LoadingScreen()
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp,
                    top = 48.dp
                )
                .verticalScroll(rememberScrollState())
                .navigationBarsPadding()
                .imePadding()
        ) {
            PageHeader(onClick = {
                navController?.popBackStack()
            }, title = "Entrar")

            Text(
                text = "Bem-vindo de volta!",
                textAlign = TextAlign.Center,
                fontSize = 26.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
            )
            Text(
                text = "Por favor, faça login para continuar",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight(500),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Email",
                fontSize = 14.sp,
                fontWeight = FontWeight(500)
            )
            CustomTextField(
                value = email,
                onValueChange = {
                    email = it
                    showEmailError = false
                    loginError = false
                },
                label = "Email",
                placeholder = "example@gmail.com",
                isError = showEmailError
            )
            if (showEmailError) {
                Text(
                    text = "Por favor, insira um e-mail válido.",
                    color = Color.Red,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Senha",
                fontSize = 14.sp,
                fontWeight = FontWeight(500)
            )
            CustomTextField(
                value = password,
                onValueChange = {
                    password = it
                    showPasswordError = false
                    loginError = false
                },
                label = "Senha",
                placeholder = "Senha",
                isPassword = true,
                showPassword = showPassword,
                onShowPasswordChange = { showPassword = !showPassword },
                isError = showPasswordError
            )
            if (showPasswordError) {
                Text(
                    text = "Sua senha deve ter pelo menos 8 caracteres.",
                    color = Color.Red,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                )
            }

            if (loginError) {
                Text(
                    text = "Email ou senha inválidos.",
                    color = Color.Red,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                GenericButton(text = "Entrar", onClick = {
                    if (isEmailValid && isPasswordValid) {
                        coroutineScope.launch {
                            val user = userViewModel?.validateUser(email, password)
                            if (user != null) {
                                userViewModel.userIsLogged(true)
                                onLoginSuccess()
                            } else {
                                loginError = true
                            }
                        }
                    } else {
                        showEmailError = !isEmailValid
                        showPasswordError = !isPasswordValid
                    }
                })
            }
        }
    }
}

@Preview
@Composable
private fun FormularioDeLoginScreenPreview() {
    FormularioDeLoginScreen(navController = null, userViewModel = null)
}