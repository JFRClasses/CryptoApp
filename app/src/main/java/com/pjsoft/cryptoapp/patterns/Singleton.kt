package com.pjsoft.cryptoapp.patterns

// Singleton

class Logger private constructor(){
    fun log(message:String){
        print("Tu mensaje es $message")
    }
    companion object{
        val instance = Logger()
    }
}

fun main(){
    val log1 = Logger.instance
    val log2 = Logger.instance
    val log3 = Logger.instance
    log1.log("Hola")
}