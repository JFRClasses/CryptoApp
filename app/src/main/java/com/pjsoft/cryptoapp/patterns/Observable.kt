package com.pjsoft.cryptoapp.patterns

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

//FLUJOS FORZAMENTE CORRUTINA
// Stream
fun main(){
    runBlocking {
        val flujo = flow {
            emit(1)
            emit(2)
            emit(3)
            emit(4)
        }

        flujo.collect{ value ->
            println("Recibi un mensaje: $value")
        }
        //RxJS
        val flow2 = flowOf(10,20,30,40)
        flow2.collect{ value ->

        }
        val list = listOf("Iniciado","Cargando","Terminado")
        val flow3 = list.asFlow()
        flow3.collect{ value ->
            //Flux
        }
    }
}