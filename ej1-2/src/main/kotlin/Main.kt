fun calcular (horastrabajadas: String, precioporhora: String): Int {
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