package br.com.pokedex.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import br.com.pokedex.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    placeholder: String,
    isPassword: Boolean = false,
    showPassword: Boolean = false,
    onShowPasswordChange: (() -> Unit)? = null,
    isError: Boolean = false
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                label, color = if (isError) {
                    Color.Red
                } else {
                    if (isSystemInDarkTheme()) {
                        Color.White
                    } else {
                        Color.Black
                    }
                }
            )
        },
        placeholder = { Text(placeholder) },
        modifier = Modifier
            .fillMaxWidth(),
        visualTransformation = if (isPassword && !showPassword) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
        trailingIcon = if (isPassword && onShowPasswordChange != null) {
            {
                IconButton(onClick = onShowPasswordChange) {
                    Icon(
                        painter = if (showPassword) {
                            painterResource(id = R.drawable.ic_visibility)
                        } else {
                            painterResource(id = R.drawable.ic_visibility_off)
                        },
                        contentDescription = null
                    )
                }
            }
        } else null,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = if (isError) Color.Red else Color.Blue,
            unfocusedBorderColor = if (isError) Color.Red else Color.Gray
        )
    )
}


