package com.pjsoft.cryptoapp.presentation.navigation

import kotlinx.serialization.Serializable


sealed class Screens(){
    @Serializable
    object LoginScreenRoute : Screens()

    @Serializable
    object RegisterScreenRoute

    @Serializable
    object MainScreenRoute

    @Serializable
    object MainGraph

    @Serializable
    object HomeScreenRoute :

    @Serializable
    object StatsScreenRoute
}




enum class Screen {
    Main,
    Register,
    Login,
    Home
}