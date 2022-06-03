import kotlin.math.absoluteValue

fun serie(numero: Int): MutableList<Int>{
    var listaPar = mutableListOf(-2)
    var listaImpar = mutableListOf(1)
    var cantidad = numero/2-2
    if(numero%2==0){
        for(i in 0..cantidad){
            listaPar.add(listaPar[i]-2)
            listaImpar.add(listaImpar[i]+2)
        }
    }
    else {
        for(i in 0..cantidad+1){
            listaImpar.add(listaImpar[i]+2)
        }
        for(i in 0..cantidad){
            listaPar.add(listaPar[i]-2)
        }
    }
    var listafinal: MutableList<Int> = listaPar
    listafinal.addAll(listaImpar)
    listafinal = listafinal.sortedBy {it.absoluteValue}.toMutableList()
    return listafinal
}

fun main() {
    println(serie(50))
}