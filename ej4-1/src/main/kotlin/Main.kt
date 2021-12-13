fun suma(lista: MutableList<Int>, total: Int):Int{
    var suma = 0
    for (i in 0..total-1){
        suma=suma+lista[i]
    }
    return suma
}
fun media(suma: Int,total: Int):Double{
    val media = suma.toDouble()/total.toDouble()
    return media
}
fun main() {
    println("¿Cuántos números quieres introducir?")
    val total = readLine()?.toInt()?: 0
    val lista: MutableList<Int> = mutableListOf()
    for (i in 0..total-1){
        println("Introduce valor: ")
        lista.add(readLine()?.toInt()?: 0)
    }
    val suma = suma(lista,total)
    print("La suma de los números: $suma, ")
    print("la cantidad de números introducidos: $total y ")
    print("la media: ")
    println(media(suma,total))
}