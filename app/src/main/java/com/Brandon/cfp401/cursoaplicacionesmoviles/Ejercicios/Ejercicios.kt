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
fun ejArray3() {
    val numeros: Array<Int> = arrayOf(12, 4, 19, 33, 2, 7, 25, -8, 14, 6, 9, 3)
    var minimo: Int = Int.MAX_VALUE
    var maximo: Int = Int.MIN_VALUE
    for(num in numeros) {
        if (num < minimo) minimo = num
        if (num > maximo) maximo = num
    }
        println("El número mínimo es: $minimo")
        println("El número máximo es: $maximo")


        }
/**TODO
 * 1.Recibir el array por parámetro
 * 2.Inicializar un contador en 0
 * 3.Mientras recorro el arreglo
 * 3.1.
 */
fun ejArray4(numero: Array<Int>) {
    var contador: Int = 0
    val pares: ArrayList<Int> = arrayListOf()
    for (num in numero) {
        num % 2
        if (num % 2 == 0) {
            contador++
            pares.add(num)
        }

    }
    println("los $pares ")
}
    /**
     * TODO
     * 1.
     * 2.
     * 3.
     */
 fun ejArray5(colores: ArrayList<String>) {
        for ((indise, color) in colores.withIndex()) {
            if (color == "rojo") colores[indise] = color.uppercase()
        }
        println(colores)
 }


fun ejArray6() {

}

fun main() {
     val resultado = ejArray4(arrayOf(
         20.4,
         2.0,
 }