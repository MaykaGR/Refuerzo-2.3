fun conversor (temperatura: String): Double {
    val multiplicador = 33.8
    var temp = temperatura.toInt()
    var fahrenheit = temp*multiplicador
    return fahrenheit
}
fun main(args: Array<String>) {
    println("Introduce temperatura en grados celsius: ")
    var temperatura = readLine()
    println (conversor(temperatura.toString()))
}