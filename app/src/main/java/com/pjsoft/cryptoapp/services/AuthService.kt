package com.pjsoft.cryptoapp.services

import com.pjsoft.cryptoapp.domain.dtos.BodyResponse
import com.pjsoft.cryptoapp.domain.models.Auth
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("login")
    suspend fun login(@Body auth: Auth) : BodyResponse

    @POST("register")
    suspend fun register(@Body auth: Auth) : BodyResponse
}