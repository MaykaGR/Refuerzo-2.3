const val pi= 3.14
fun longitud(radio: Double): Double{
    val longitud = 2*pi*radio
    return longitud
}
fun main() {
    val radio = 5.00
    println(longitud(radio))
}