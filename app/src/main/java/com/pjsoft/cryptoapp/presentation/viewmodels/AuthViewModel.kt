package com.pjsoft.cryptoapp.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pjsoft.cryptoapp.domain.models.Auth
import com.pjsoft.cryptoapp.services.AuthService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authService : AuthService
) : ViewModel() {

    // success LiveData
    private val _registerEvent = MutableSharedFlow<String>()
    val registerEvent = _registerEvent.asSharedFlow()

    fun login(email : String, password : String){
        val auth = Auth(email = email, password = password)
        viewModelScope.launch {
            val response = authService.login(auth)
            Log.i("AuthViewModel", response.toString())
        }
    }
    fun register(email : String, password : String){
        val auth = Auth(email = email, password = password)
        viewModelScope.launch {
            val response = authService.register(auth)
            Log.i("AuthViewModel", response.toString())
            if(response.body.isLogged){
                // QUe se registro correctamente
                _registerEvent.emit("Success")
            }
            else{
                // Hubo un error
                _registerEvent.emit(response.messageContent)
            }
        }
    }
}