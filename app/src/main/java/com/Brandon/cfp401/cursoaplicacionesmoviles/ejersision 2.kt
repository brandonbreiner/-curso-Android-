package com.Brandon.cfp401.cursoaplicacionesmoviles

fun main() {
    println(dia(1))
}

fun dia(dia: Int): String {
    return when (dia) {
        1 -> "lunes"
        2 -> "martes"
        3 -> "miércoles"
        4 -> "jueves"
        5 -> "viernes"
        6 -> "sábado"
        7 -> "domingo"
        else -> "Número inválido"
    }
}
