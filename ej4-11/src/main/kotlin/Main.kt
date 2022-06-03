fun central(num1: Int, num2: Int, num3: Int): Int{
    var lista = listOf(num1,num2,num3)
    var listaordenada = lista.sorted()
    return listaordenada[1]
}

fun centralAlternativa(num1: Int, num2: Int, num3: Int): Int{
    var lista = mutableListOf(num1,num2,num3)
    for(i in 0..2){
        if(i<2 && lista[i]>lista[i+1]){
            var temporal = lista[i]
            lista[i] = lista[i+1]
            lista[i+1] = temporal
        }
    }
    return lista[1]
}

fun main() {
    println(centralAlternativa(8,3,9))
}