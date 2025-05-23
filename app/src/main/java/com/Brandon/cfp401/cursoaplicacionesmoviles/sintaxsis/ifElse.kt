package com.Brandon.cfp401.cursoaplicacionesmoviles.sintaxsis

/*
 * Estructura de Control IfElse en una función
 * Evaluando si una persona es mayor o menor de edad
 */

fun main() {
    println("Ingrese su edad:")
    val edad = readln().toInt()

    println(verificarEdad(edad))
}

fun verificarEdad(edad: Int): String {
    return if (edad >= 18) {
        "Es mayor de edad."
    } else {
        "Es menor de edad."
    }
    
}