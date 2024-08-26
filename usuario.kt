package com.arvr.helloapp

import android.hardware.biometrics.BiometricManager.Strings
import java.util.Date

class Usuario {
    var nombre:String
    var paterno:String
    var materno:String
    var fechaNacimiento:String

    constructor (nombre:String,paterno:String,materno:String,fechaNacimiento:String)
    {
        this.nombre=nombre
        this.paterno=paterno
        this.materno=materno
        this.fechaNacimiento=fechaNacimiento
    }

    fun saludar(){
        println("Hola mi nombre es $nombre $paterno $materno")
    }
}