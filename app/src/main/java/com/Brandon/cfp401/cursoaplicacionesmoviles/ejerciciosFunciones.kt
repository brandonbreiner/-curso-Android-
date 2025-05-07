package com.Brandon.dfp401.cursoaplicacionesmoviles


 fun areaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}
fun convertirCelsiusAFahrenheit(celsius: Double): Double {
    return (celsius * 9/5) + 32
}

fun main() {
    val area = areaRectangulo(4.0, 5.0)

    println("El área del rectángulo es: $area")

    val temperaturaF = convertirCelsiusAFahrenheit(25.0)
    println("25 grados Celsius son: $temperaturaF Fahrenheit")




}