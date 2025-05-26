package com.pjsoft.cryptoapp.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pjsoft.cryptoapp.R
import com.pjsoft.cryptoapp.presentation.components.Lock
import com.pjsoft.cryptoapp.presentation.components.Visibility
import com.pjsoft.cryptoapp.presentation.components.Visibility_off
import com.pjsoft.cryptoapp.presentation.ui.theme.CryptoAppTheme

@Composable
fun LoginScreen(){


    var password by remember {
        mutableStateOf("")
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Texto del titulo
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold,
            letterSpacing = 3.sp
        )
        // Imagen
        Image(
            painter = painterResource(R.drawable.crypto1),
            contentDescription = "login",
            modifier = Modifier.size(250.dp),
            contentScale = ContentScale.Crop
        )
        //Textfield Correo
        OutlinedTextField(
            value = "",
            onValueChange = {  },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "email"
                )
            },
            placeholder = { Text(text = "Correo Electronico") },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        //Textfield Contraseña
        OutlinedTextField(
            value = password,
            onValueChange = { password = it  },
            leadingIcon = {
                Icon(
                    imageVector = Lock,
                    contentDescription = "contraseña"
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = if(isPasswordVisible) Visibility_off
                    else Visibility,
                    contentDescription = "contraseña",
                    modifier = Modifier.clickable {
                        isPasswordVisible = !isPasswordVisible
                    }
                )
            },
            placeholder = { Text(text = "Contraseña") },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            visualTransformation =
            if(isPasswordVisible) VisualTransformation.None
            else PasswordVisualTransformation()
        )
        //Boton iniciar sesion
        Button(
            onClick = {  },
            modifier = Modifier.fillMaxWidth().height(40.dp)
        ) {
            Text(
                text = "Iniciar sesion"
            )
        }
        //Texto de crear cuenta
        Text(
            text = "¿No tienes una cuenta? Crea una"
        )
    }
}

@Composable
@Preview
fun LoginScreenPreview(){
    CryptoAppTheme {
        LoginScreen()
    }
}