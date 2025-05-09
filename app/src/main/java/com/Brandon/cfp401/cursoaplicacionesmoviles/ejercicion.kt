package com.Brandon.cfp401.cursoaplicacionesmoviles

fun main() {
    val edad = 666
    val resultado = clasificarEdad(edad)
    println("La clasificación para la edad $edad es: $resultado")
}

fun clasificarEdad(edad: Int): String {
    return when (edad) {
        in 0..12 -> "Niño"
        in 13..17 -> "Adolescente"
        in 18..64 -> "Adulto"
        in 65..150 -> "Adulto mayor"
        else -> "¿Ni que fueras Mirta Legrand?"
    }
}