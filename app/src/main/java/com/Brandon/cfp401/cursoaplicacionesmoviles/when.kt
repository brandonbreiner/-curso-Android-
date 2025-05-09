package com.Brandon.cfp401.cursoaplicacionesmoviles

fun main() {
    println(getMonth(4))
    println(getMonth(2))
    println(getMonth(13))
}

fun getMonth(mes: Int): String {
    return when (mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Mes inválido"
    }
}