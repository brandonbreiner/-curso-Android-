package com.Brandon.cfp401.cursoaplicacionesmoviles

/*
    Una funcion es una caja negra que realiza una accion y nos devuelve  o no, un resultado.

    se utiliza para modularizar y hacer
 */

// Sintaxis

// fun nombreDeFuncion(){ // aca va el codigo }

/**
fun saludapepe(){
    var nombre : String = "pepe"
        println("Hola soy pepe")
}
fun miSaludo() {
     println("Hola soy brandon")
}


 * 1crear una funcion mi saludo que imprima hola soy tu nombre


    fun main () {
        saludapepe()
        miSaludo()
    }*/


fun areaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun main() {
    var resultado1: Double = areaRectangulo(2.0, 8.0)
    println(resultado1)
}