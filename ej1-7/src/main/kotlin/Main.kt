fun sumar(primerNum: Int, segundoNum: Int, tercerNum: Int): Int{
    var total = primerNum+segundoNum+tercerNum
    return total
}
fun main(args: Array<String>) {
    println ("Primer número: ")
    var primerNum = readLine()?.toInt()?: 0
    println ("Segundo número: ")
    var segundoNum = readLine()?.toInt()?: 0
    println ("Tercer número: ")
    var tercerNum = readLine()?.toInt()?: 0
    println (sumar(primerNum, segundoNum, tercerNum))
}