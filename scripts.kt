package com.arvr.helloapp

//POO constructor primario
class Persona( val nombre:String, var edad:Int)
{
    fun saludar(){
        println("Hola mi nombre es $nombre y mi edad es $edad ")
    }
}

// constructor secundario
class Persona2{

    var nombre:String?=""
    var edad:Int=0

    constructor(nombre:String,edad:Int){
        this.nombre=nombre
        this.edad = edad
    }
    fun saludar(){
        println("Hola mi nombre es $nombre y mi edad es $edad ")
    }
}


//Herencia usando  para permitr usamos open

open class Persona3{

    var nombre:String?=""
    var edad:Int=0

    constructor(nombre:String,edad:Int){
        this.nombre=nombre
        this.edad = edad
    }
    open fun saludar(){
        println("Hola mi nombre es $nombre y mi edad es $edad ")
    }
}

class Estudiante(nombre: String, edad: Int, val escuela: String): Persona3(nombre,edad){

    override fun saludar()
    {
        println("Hola mi nombre es $nombre, mi edad es $edad  y mi escuela es $escuela")
    }
}


/*Singleton
object Singleton {
    var contador: Int = 0

    fun incrementar() {
        contador++
    }
}*/
fun main()
{
    var persona =Persona("Jose",16)

    persona.saludar()

    var person = Persona2("Jose",26)
    person.saludar()

    val estudiante = Estudiante("Juan", 20, "Universidad XYZ")
    estudiante.saludar()

    println("Ingrese dos números")
    var numero1:Int?
    var numero2:Int?

    print("Primer número:")
    val dato1=readln()
    print("Primer número:")
    val dato2=readln()

    println(dato1.toInt())
    println(dato2.toInt())

    val resultado = suma(dato1.toInt(),dato2.toInt())

    print("Suma = $resultado")

}

fun suma(num1:Int,num2:Int):Int{

    return num1 + num2
}
fun suma2(num1:Int,num2:Int)=num1+num2

