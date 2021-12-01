fun calcular (horastrabajadas: Int, precioporhora: Int): Double {
    var horas = horastrabajadas
    var precio: Double
    if (horas>40){precio= precioporhora.toDouble()*1.5
    }
    else precio=precioporhora.toDouble()
    var total= horas*precio
    return total
}
fun main() {
    var horastrabajadas: Int
    var precioporhora: Int
    println ("Introduce horas trabajadas: ")
    try {
        horastrabajadas= readLine()?.toInt()?: 0
    }
    catch(e:java.lang.NumberFormatException){println("Error, por favor introduzca un número: ")
    horastrabajadas= readLine()?.toInt()?: 0}
    println ("Introduce precio por hora: ")
    try {
        precioporhora= readLine()?.toInt()?: 0
    }
    catch(e:java.lang.NumberFormatException){println("Error, por favor introduzca un número: ")
        precioporhora= readLine()?.toInt()?: 0}
    var total = calcular(horastrabajadas,precioporhora)
    println (total)

}