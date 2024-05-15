package br.com.pokedex.ui.screens

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.R
import br.com.pokedex.ui.activity.FormaDeCadastroUsuarioActivity
import br.com.pokedex.ui.components.CustomTextField
import br.com.pokedex.ui.components.GenericButton
import br.com.pokedex.ui.components.PageHeader

@Composable
fun FormularioCadastroScreen() {
    var currentPage by remember { mutableStateOf(0) }
    val onNext: () -> Unit = { currentPage++ }

    when (currentPage) {
        0 -> CadastroEmailTemplate(onNext)
        1 -> CadastroSenhaTemplate(onNext)
        2 -> CadastroNomeTemplate(onNext)
        3 -> CadastroRealizadoScreen()
    }
}

@Composable
private fun CadastroEmailTemplate(onNext: () -> Unit) {
    var email by rememberSaveable { mutableStateOf("") }
    var showError by remember { mutableStateOf(false) }
    val isEmailValid = email.isNotBlank() && email.contains("@")

    CadastroTemplate(
        headerText = "Vamos começar!",
        subHeaderText = "Qual é o seu e-mail?",
        onNext = {
            if (isEmailValid) {
                onNext()
            } else {
                showError = true
            }
        }
    ) {
        CustomTextField(
            value = email,
            onValueChange = {
                email = it
                showError = false
            },
            label = "Email",
            placeholder = "example@gmail.com",
            isError = showError
        )
        if (showError) {
            Text(
                text = "Por favor, insira um e-mail válido.",
                color = Color.Red,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )
        } else {
            Text(
                text = "Use um endereço de e-mail válido.",
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            GenericButton(text = "Continuar", onClick = {
                if (isEmailValid) onNext() else showError = true
            }
            )
        }
    }
}

@Composable
private fun CadastroSenhaTemplate(onNext: () -> Unit) {
    var showPassword by remember { mutableStateOf(false) }
    var password by remember { mutableStateOf("") }
    var showError by remember { mutableStateOf(false) }
    val isPasswordValid = password.isNotBlank() && password.length >= 8

    CadastroTemplate(
        headerText = "Agora...",
        subHeaderText = "Crie uma senha",
        onNext = {
            if (isPasswordValid) {
                onNext()
            } else {
                showError = true
            }
        }
    ) {
        CustomTextField(
            value = password,
            onValueChange = {
                password = it
                showError = false
            },
            label = "Senha",
            placeholder = "Senha",
            isPassword = true,
            showPassword = showPassword,
            onShowPasswordChange = { showPassword = !showPassword },
            isError = showError
        )
        if (showError) {
            Text(
                text = "Sua senha deve ter pelo menos 8 caracteres.",
                color = Color.Red,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )
        } else {
            Text(
                text = "Sua senha deve ter pelo menos 8 caracteres",
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            GenericButton(text = "Continuar", onClick = { if (isPasswordValid) onNext() else showError = true })
        }
    }
}


@Composable
private fun CadastroNomeTemplate(onNext: () -> Unit) {
    var name by rememberSaveable { mutableStateOf("") }
    var showError by remember { mutableStateOf(false) }
    val isNameValid = name.isNotBlank()

    CadastroTemplate(
        headerText = "Para finalizar",
        subHeaderText = "Qual é o seu nome?",
        onNext = {
            if (isNameValid) {
                onNext()
            } else {
                showError = true
            }
        }
    ) {
        CustomTextField(
            value = name,
            onValueChange = {
                name = it
                showError = false
            },
            label = "Nome",
            placeholder = "Nome",
            isError = showError
        )
        if (showError) {
            Text(
                text = "Por favor, insira um nome válido.",
                color = Color.Red,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )
        } else {
            Text(
                text = "Esse será seu nome de usuário no aplicativo.",
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            GenericButton(text = "Criar conta", onClick = { if (isNameValid) onNext() else showError = true })
        }
    }
}


@Composable
fun CadastroTemplate(
    title: String = "Criar conta",
    headerText: String,
    subHeaderText: String,
    onNext: () -> Unit = {},
    content: @Composable ColumnScope.() -> Unit = {}
) {
    val context = LocalContext.current
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
    ) {
        PageHeader(
            onClick = {
                context.startActivity(
                    Intent(
                        context,
                        FormaDeCadastroUsuarioActivity::class.java
                    )
                )
            },
            title = title
        )
        Text(
            text = headerText,
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp)
        )
        Text(
            text = subHeaderText,
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight(500),
            modifier = Modifier.fillMaxWidth()
        )

        content()
    }
}

@Preview(showBackground = true)
@Composable
private fun FormularioCadastroScreenPreview() {
    CadastroSenhaTemplate(onNext = {})
}
