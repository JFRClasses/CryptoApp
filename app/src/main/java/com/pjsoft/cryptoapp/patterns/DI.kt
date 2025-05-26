package com.pjsoft.cryptoapp.patterns

// Construir una clase con sus subclases para funcionen DTO


class Transistores(val n : Int)

 class Procesador(val marca: String, val transistores: Transistores)

 class MotherBoard(val marca: String)

class Storage(val gb : Double)

class SSD(val gb : Double) : IStorage {
    override fun leer() {
        TODO("Not yet implemented")
    }

    override fun escribir() {
        TODO("Not yet implemented")
    }
}

class HDD(val gb : Double) : IStorage {
    override fun leer() {
        TODO("Not yet implemented")
    }

    override fun escribir() {
        TODO("Not yet implemented")
    }
}

interface IStorage{
    fun leer()
    fun escribir()
}

class Computer(val procesador: Procesador, val mb: MotherBoard, val storage: IStorage) {
    fun encender() {
        println("Encendiendo")
    }
}
// Dagger Hilt
fun main(){
    val computer = Computer(
        procesador = Procesador(marca = "Intel", transistores = Transistores(n = 1000)),
        mb = MotherBoard(marca = "ASUS"),
        storage = SSD(gb = 50.0)
    )
}

// D Principios SOLID

// Principio de Inversion de Dependencias
// TUUUUU DEBES DE DEPENDER DE ABSTRACCIONES Y NO DE CONSTRUCCIONES

// Conectarse a una DB MySQL / Mongo

// Inyeccion de Dependencias Ejericio

interface IMotor{
    fun encender()
}

class Motor(val hp: Double) : IMotor {
    override fun encender() {
        TODO("Not yet implemented")
    }
}

class MotorElectrico(val hp : Double) : IMotor {
    override fun encender() {
        TODO("Not yet implemented")
    }
}

class MotorHibrido(val hp : Double) : IMotor {
    override fun encender() {
        TODO("Not yet implemented")
    }
}

class Car(val motor: IMotor, val puertas : Int)