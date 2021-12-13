fun pares():IntArray{
    var lista = IntArray(25)
    var posicion = 0
    for(i in 1..50){
        if(i%2==0){lista[posicion]=i
        posicion=posicion+1}
    }
    return lista
}
fun main() {
   val lista = pares()
    for(i in lista){
        print("$i,")
    }
}