package com.pjsoft.cryptoapp.presentation.screens.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pjsoft.cryptoapp.presentation.navigation.Screens
import com.pjsoft.cryptoapp.presentation.ui.theme.CryptoAppTheme

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = Screens.HomeScreenRoute){
            composable<Screens.HomeScreenRoute> {
                HomeScreen(innerPadding = innerPadding)
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview(){
    CryptoAppTheme {
        MainScreen()
    }
}