package com.pjsoft.cryptoapp.patterns

// Builder
// Retrofit().Builder().baseURL(")
// Retrofit(nombre = "")

class Usuario private constructor(
    val nombre : String,
    val edad : Int,
    val correo : String
){
    class Builder{
        private var nombre : String = ""
        private var edad : Int = 0
        private var correo : String = ""

        fun agregarNombre(nombre : String) = apply {
            this.nombre = nombre
        }


        fun agregarEdad(edad: Int) = apply {
            this.edad = edad
        }

        fun agregarCorreo(correo : String) = apply{
            this.correo = correo
        }

        fun build() : Usuario{
            return Usuario(nombre,edad,correo)
        }
    }
}

fun main(){
    val usuario = Usuario.Builder()
        .agregarNombre("Juan")
        .agregarEdad(28)
        .agregarCorreo("Juanfr97")
        .build()
}