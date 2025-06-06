package com.pjsoft.cryptoapp.presentation.screens.auth

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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pjsoft.cryptoapp.R
import com.pjsoft.cryptoapp.presentation.components.Lock
import com.pjsoft.cryptoapp.presentation.components.Visibility
import com.pjsoft.cryptoapp.presentation.components.Visibility_off
import com.pjsoft.cryptoapp.presentation.navigation.Screens
import com.pjsoft.cryptoapp.presentation.ui.theme.CryptoAppTheme
import com.pjsoft.cryptoapp.presentation.viewmodels.AuthViewModel
import com.pjsoft.cryptoapp.presentation.viewmodels.OtroTestingViewModel
import com.pjsoft.cryptoapp.presentation.viewmodels.TestingViewModel

@Composable
fun LoginScreen(navController: NavController){

    val viewModel : AuthViewModel = hiltViewModel()
    var email by remember{
        mutableStateOf("")
    }
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
        // Imagen HStack
        Image(
            painter = painterResource(R.drawable.crypto1),
            contentDescription = "login",
            modifier = Modifier.size(250.dp),
            contentScale = ContentScale.Crop
        )
        //Textfield Correo
        OutlinedTextField(
            value = email,
            onValueChange = { email = it  },
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
        //Boton iniciar sesion localstorage
        Button(
            onClick = {
//                navController.navigate(Screens.MainScreenRoute){
//                    popUpTo(Screens.LoginScreenRoute){ inclusive = true }
//                }
                viewModel.login(
                    email = email,
                    password = password
                )
            },
            modifier = Modifier
                .padding(bottom = 20.dp)
                .fillMaxWidth()
                .height(40.dp)
        ) {
            Text(
                text = "Iniciar sesion"
            )
        }
        //Texto de crear cuenta
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(MaterialTheme.colorScheme.onBackground)){
                    append("¿No tienes una cuenta? ")
                }
                pushStyle(
                    SpanStyle(
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Bold
                    )
                )
                append("Crea una")
            },
            modifier = Modifier.clickable {
                navController.navigate(Screens.RegisterScreenRoute)
            }
        )
    }
}

@Composable
@Preview
fun LoginScreenPreview(){
    CryptoAppTheme {
        LoginScreen(navController = rememberNavController())
    }
}