fun calcular (horastrabajadas: String, precioporhora: String): Double {
    var horas = horastrabajadas.toInt()
    var precio: Double
    if (horas>40){precio= precioporhora.toDouble()*1.5
        }
    else precio=precioporhora.toDouble()
    var total= horas*precio
    return total
}
fun main() {
    var horastrabajadas: String = ""
    var precioporhora: String = ""
    println ("Introduce horas trabajadas: ")
    horastrabajadas= readLine().toString()
    println ("Introduce precio por hora: ")
    precioporhora= readLine().toString()
    var total = calcular(horastrabajadas,precioporhora)
    println (total)

}