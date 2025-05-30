package com.Brandon.cfp401.cursoaplicacionesmoviles.Ejercicios


fun ejArray1() {
    val miArreglo: Array<Int> = arrayOf(5, 7, 9, 22, 30)
    miArreglo.forEach { println(it) }
}

fun ejArray2A() {
        var numeros = arrayOf(4, 7, 2, 9, 1, 6, 3, 5)
        var suma = numeros.sum()
        println("La suma total es: $suma")
    }

fun ejArray2B() {
        val sumaTotal: Array<Int> = arrayOf(4, 7,2, 9,1, 6, 3, 5)
        var sumaParcial = 0
        for (i in sumaTotal.indices) {
            sumaParcial += sumaTotal[i]
        }
        println("La suma total es: $sumaParcial")
}



fun main() {
    ejArray2B()

}