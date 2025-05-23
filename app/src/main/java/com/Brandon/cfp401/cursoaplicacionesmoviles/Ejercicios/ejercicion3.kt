fun describirClima(temperatura: Int, estaLloviendo: Boolean): String {
    return when (temperatura) {
        in Int.MIN_VALUE until 0 -> if (estaLloviendo) "Nieve" else "Muy frío"
        in 0..15 -> if (estaLloviendo) "Frío y lluvioso" else "Frío"
        in 16..25 -> if (estaLloviendo) "Templado con lluvia" else "Templado"
        in 26..30 -> if (estaLloviendo) "Calor húmedo" else "Caluroso"
        else -> "Temperatura fuera de rango"
    }
}

fun main() {
    val temp1 = 10
    val lluvia1 = true

    val temp2 = 28
    val lluvia2 = false

    println(describirClima(temp1, lluvia1))
    println(describirClima(temp2, lluvia2))
}