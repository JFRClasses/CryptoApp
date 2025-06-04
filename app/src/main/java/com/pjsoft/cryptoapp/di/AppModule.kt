package com.pjsoft.cryptoapp.di

import com.pjsoft.cryptoapp.services.AuthService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule{
    const val BASE_URL = "https://cryptoapi.juanfrausto.com/"
    // String / AuthService
    @Provides
    @Singleton
    fun providesATestingString() : String{
        return "Hola ando probado dagger hilt"
    }

    @Provides
    @Singleton
    fun providesRetrofitInstance() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesAuthService(retrofit: Retrofit) : AuthService{
        return retrofit.create(AuthService::class.java)
    }
}