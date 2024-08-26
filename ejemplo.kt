package com.arvr.helloapp

import java.time.LocalDate

object Singleton {
    var contador: Int = 0

    fun incrementar() {
        contador++
    }

    fun mostrarContador() {
        println("Contador: $contador")
    }
}

fun main(){
    Singleton.incrementar()
    Singleton.mostrarContador()

    Singleton.incrementar()
    Singleton.mostrarContador()


    val user = Usuario("Jose","Perez","Rodriguez", "2020-01-01")

    println(user.saludar())
}