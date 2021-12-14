fun calcular (horastrabajadas: String, precioporhora: String): Int { //<-- No esta mal, pero intentaria separar la lectura de datos y conversion a enteros de lo que es el calculo. Las funciones deben de hacer solo una cosa.
    var horas = horastrabajadas.toInt()
    var precio = precioporhora.toInt()
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
