fun bisiesto (year: Int):Boolean{
    val bisiesto = year%4==0
    if(bisiesto){return true} else return false
}
fun main() {
    println("Introduce año: ")
    val year = readLine()?.toInt()?: 0
    if(bisiesto(year)){println("Bisiesto")} else println("No bisiesto")
}