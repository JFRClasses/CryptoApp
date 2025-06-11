package com.pjsoft.cryptoapp.domain.dtos

data class BodyResponse(
    val body : AuthResponse,
    val messageTitle : String,
    val messageContent : String
)