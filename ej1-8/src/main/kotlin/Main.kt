fun main(args: Array<String>) {
    var temporal: Int
    var total: Int = 0
    for (i in 0..2){
        println ("Introduce número: ")
        temporal = readLine()?.toInt()?: 0
        total = total + temporal
    }
    println (total)
}