package com.pjsoft.cryptoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.pjsoft.cryptoapp.presentation.navigation.LoginScreenRoute
import com.pjsoft.cryptoapp.presentation.navigation.MainGraph
import com.pjsoft.cryptoapp.presentation.navigation.MainScreenRoute
import com.pjsoft.cryptoapp.presentation.navigation.RegisterScreenRoute
import com.pjsoft.cryptoapp.presentation.screens.auth.LoginScreen
import com.pjsoft.cryptoapp.presentation.screens.auth.RegisterScreen
import com.pjsoft.cryptoapp.presentation.screens.main.MainScreen
import com.pjsoft.cryptoapp.presentation.ui.theme.CryptoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoAppTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = LoginScreenRoute){
                    composable<LoginScreenRoute> {
                        LoginScreen(navController = navController)
                    }
                    composable<RegisterScreenRoute> {
                        RegisterScreen(innerPadding = PaddingValues(20.dp))
                    }
                    navigation<MainGraph>(startDestination = MainScreenRoute){
                        composable<MainScreenRoute> {
                            MainScreen()
                        }
                    }
                }
            }
        }
    }
}