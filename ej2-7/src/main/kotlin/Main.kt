fun main() {
    println("Introduce primer número: ")
    val primer = readLine()?.toInt()?: 0
    println ("Introduce segundo número: ")
    val segundo = readLine()?.toInt()?: 0
    println ("Introduce operación: +, -, * o /")
    val operacion = readLine()
    when(operacion){
        "+" -> println(primer+segundo)
        "-" -> println(primer-segundo)
        "*" -> println(primer*segundo)
        "/" -> println(primer/segundo)
        else -> println("Ninguna operación válida introducida")
    }

}