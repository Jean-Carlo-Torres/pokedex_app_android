package br.com.pokedex.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import br.com.pokedex.ui.activity.ui.theme.PokedexTheme
import br.com.pokedex.ui.components.CustomTextField
import br.com.pokedex.ui.components.GenericButton
import br.com.pokedex.ui.components.PageHeader

@Composable
fun TrocarNomePerfil(navController: NavController?, userViewModel: UserViewModel?) {
    PokedexTheme {
        Surface {
            var showNameError by remember { mutableStateOf(false) }
            var nome by remember { mutableStateOf(userViewModel?.user?.nome ?: "") }
            var nomeError by remember { mutableStateOf(false) }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                PageHeader(title = "Trocar nome",
                    onClick = {
                        navController?.popBackStack()
                    }
                )
                TextTitleDefault("Insira o novo nome de usuário")
                Text(
                    text = "Nome de usuário",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500)
                )

                CustomTextField(
                    value = nome,
                    onValueChange = {
                        nome = it
                        showNameError = false
                        nomeError = false
                    },
                    label = "Nome",
                    placeholder = userViewModel?.user?.nome ?: "Nome de usuário",
                    isError = showNameError
                )
                if (nome.isNullOrEmpty()) {
                    nomeError = true
                }

                if (showNameError) {
                    Text(
                        text = "O nome de usuário não pode ser vazio",
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
                    GenericButton(
                        text = "Atualizar",
                        onClick = {
                            userViewModel?.user?.let { user ->
                                val updatedUser = user.copy(nome = nome)
                                userViewModel.updateUser(updatedUser)
                            }
                            navController?.popBackStack()
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun TrocarEmailPerfil(navController: NavController?, userViewModel: UserViewModel?) {
    PokedexTheme {
        Surface {
            var showError by remember { mutableStateOf(false) }
            var email by remember { mutableStateOf(userViewModel?.user?.email ?: "") }
            val isEmailValid = email.isNotBlank() && email.contains("@")

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                PageHeader(
                    title = "Trocar Email",
                    onClick = {
                        navController?.popBackStack()
                    }
                )

                TextTitleDefault("Insira o novo email")

                Text(
                    text = "Email",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500)
                )

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
                }

                Spacer(modifier = Modifier.weight(1f))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    GenericButton(
                        text = "Atualizar",
                        onClick = {
                            if (isEmailValid) {
                                userViewModel?.user?.let { user ->
                                    val updatedUser = user.copy(email = email)
                                    userViewModel.updateUser(updatedUser)
                                }
                                navController?.popBackStack()
                            } else {
                                showError = true
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun TrocarSenhaPerfil(navController: NavController?, userViewModel: UserViewModel?) {
    PokedexTheme {
        Surface {
            var showPassword by remember { mutableStateOf(false) }
            var showError by remember { mutableStateOf(false) }
            var senha by remember { mutableStateOf(userViewModel?.user?.senha ?: "") }
            val isPasswordValid = senha.isNotBlank() && senha.length >= 8

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                PageHeader(
                    title = "Trocar Senha",
                    onClick = {
                        navController?.popBackStack()
                    }
                )

                TextTitleDefault("Insira a nova senha")

                Text(
                    text = "Senha",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500)
                )

                CustomTextField(
                    value = senha,
                    onValueChange = {
                        senha = it
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
                }

                Spacer(modifier = Modifier.weight(1f))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    GenericButton(
                        text = "Atualizar",
                        onClick = {
                            if (isPasswordValid) {
                                userViewModel?.user?.let { user ->
                                    val updatedUser = user.copy(senha = senha)
                                    userViewModel.updateUser(updatedUser)
                                }
                                navController?.popBackStack()
                            } else {
                                showError = true
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun TextTitleDefault(text: String) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        fontWeight = FontWeight(500),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp, bottom = 16.dp)
    )
}


@Preview(showBackground = true)
@Composable
private fun TrocarNomeScreenPreview() {
    TrocarNomePerfil(navController = null, userViewModel = null)
}

@Preview
@Composable
private fun TrocarEmailScreenPreview() {
    TrocarEmailPerfil(navController = null, userViewModel = null)
}

@Preview
@Composable
private fun TrocarSenhaScreenPreview() {
    TrocarSenhaPerfil(navController = null, userViewModel = null)
}