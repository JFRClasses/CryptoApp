package com.pjsoft.cryptoapp.domain.dtos

data class AuthResponse(
    val message : String,
    val userId : Int,
    val isLogged : Boolean
)
