fun factores(numero: Int): MutableList<String>{
    val lista = mutableListOf<String>()
    for(i in 2..numero-1){
        if(numero%i==0){
            lista.add((numero/i).toString()+"*"+i.toString())
        }
    }
    return lista
}

fun main() {
    println(factores(2349))
}