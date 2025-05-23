package com.Brandon.cfp401.cursoaplicacionesmoviles.Ejercicios

import kotlin.random.Random

fun ejercio1() {
    for (i in 1..10){
        println(i)
   }
}

fun ejercio2() {

    var i: Int = 5
    while (i <= 15){
        print ("$i ")
        i++

   }
}

fun ejercio3(){

    var i: Int = 1
   do {
     println("hola")
      i++
       } while (i <= 3)
   }

fun ejercio4(){

    val arr :   Array<String> =
        arrayOf("pepe", "juan", "pedro", "luis", "carlos","brandon","terra")

    for (i in arr.indices){
        println("arr[$i] -> ${arr[i]}")
    }

}

fun ejercio5 (){
    var numeros : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var totalParcial : MutableList<Int> = mutableListOf(0)
    for(i in numeros.indices){
        totalParcial.add((totalParcial[i] + numeros[i]))
    }
}

fun ejercio6() {
    for (i in 1..5) {
        print("Tabla del $i:")
        for (j in 1..10) {
            print("$i x $j = ${i * j}")
        }
        println()
    }
}

fun ejercio7(){
    var opcion : Int
    do {
        println("ingrese una opcion:")
        println("1-saludar")
        println("2- despedir")
       println("0 - salir")
        opcion = readln().toInt()
        when (opcion) {
            1 -> println("holaa")
            2 -> println("chauuu")
            0 -> println("grasias por usar el programa")
         else -> println("ingrese invalida")
        }
    }while (opcion != 0)
}

fun ejercio8(miString: String){
    for (i in miString.length-1 downTo 0)
        print(miString[i])

}



fun ejercio9() {
    val adivinalo: Int = Random.nextInt(0, 50)
    println("Adivina el número entre 0 y 50")
    var input: Int = readln().toInt()

    while (adivinalo != input) {
        if (input > adivinalo) {
            println("El número es menor")
        } else {
            println("El número es mayor")
        }
        input = readln().toInt()
    }

    println("¡Adivinaste el número!  el primer logro de tu vida")
}

fun main() {
    ejercio9()
}
