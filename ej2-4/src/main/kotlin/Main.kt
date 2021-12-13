fun main() {
println("Introduce un número: ")
    var num = readLine()?.toInt()?: 0
    if (num%2==0){
        println("Par")
    } else println ("Impar")
}