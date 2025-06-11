package com.pjsoft.cryptoapp.domain.models

data class Transaction(
    val id : Int,
    val userId : Int,
    val amount : Double,
    val date : String,
    val type : Int
)
