fun listar(listaNums: List<Int>): MutableMap<String,Int>{
    var resultado = mutableMapOf("positivos" to 0, "negativos" to 0, "suma" to 0)
    var positivos = 0
    var negativos = 0
    var suma = 0
    for(i in 0..listaNums.size-1){
        suma = suma + listaNums[i]
        if(listaNums[i]<0){
            negativos += 1
        }
        else if(listaNums[i]>0){
            positivos += 1
        }
    }
    resultado.set("positivos", positivos)
    resultado.set("negativos", negativos)
    resultado.set("suma", suma)
    return resultado
}
fun main() {
    var listanumeros = listOf(1,-2,4,-7,8,10)
    println(listar(listanumeros))
}