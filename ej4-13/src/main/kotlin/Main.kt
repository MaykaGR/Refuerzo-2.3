fun calculadora(kilometros: Int, dias: Int): Double{
    var precio = ((kilometros*10)*2).toDouble()
    if(dias > 7 && kilometros > 800){
        precio -= precio*0.3
    }
    return precio
}

fun main() {
    println(calculadora(801,8))
}