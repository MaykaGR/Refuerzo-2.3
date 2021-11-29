fun calcularIva (precio: Double, iva: Double): Double {
    var precioTotal = precio+(precio*(iva/100))
    return precioTotal
}

fun main(args: Array<String>) {
    println ("Introduzca precio del producto: ")
    var precio = readLine()?.toDouble()?:0.0
    println ("Introduzca iva a aplicar: ")
    var iva = readLine()?.toDouble()?:0.0
    var precioTotal = calcularIva(precio,iva)
    println (precioTotal)
}