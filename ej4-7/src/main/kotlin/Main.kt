fun restasSucesivas (dividendo: Int, divisor: Int): MutableMap<String,Int>{
    var numeros = dividendo.toString()
    var array = numeros.toCharArray()
    var residuo = 0
    var cociente = ""
    for(i in 0..array.size-1){
        var numeroSeparado = (residuo.toString()+array[i]).toInt()
        cociente += (numeroSeparado/divisor).toString()
        residuo = numeroSeparado%divisor
    }
    var mapa = mutableMapOf("cociente" to cociente.toInt(),"resto" to residuo)
    return mapa
}

fun main() {
    println(restasSucesivas(67,2))
}