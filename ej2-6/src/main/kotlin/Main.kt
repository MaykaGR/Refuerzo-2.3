fun main() {
    println("Introduce el primer número: ")
    var num = readLine()?.toInt()?: 0
    println ("Introduce el segundo número: ")
    var temporal = readLine()?.toInt()?: 0
    if(temporal > num){num= temporal}
    println ("Introduce el tercer número: ")
    temporal = readLine()?.toInt()?: 0
    if(temporal > num){num= temporal}
    println("El mayor es: $num")
}