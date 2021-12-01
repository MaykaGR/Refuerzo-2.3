fun descontarIva (precio: Double?): Double? {
    var preciosiniva = precio?.div(1.10)
    return preciosiniva
}
fun main() {
    var total: Double? = 0.0
    do{
    println("Introduce precio total: ")
     total = readLine()?.toDouble()}
        while (total==null)
    println("El precio sin iva es: ${descontarIva(total)}")
}