fun cuentaBinario(N: Int): Int {
    var binario: MutableList<Int> = mutableListOf()
    var numero = N
    while (numero > 1) {
        if (numero % 2 == 0) {
            binario.add(0)
        } else binario.add(1)
        numero = numero / 2
    }
    binario.add(1)
    binario = binario.asReversed()
    return binario.size
}

fun cuentaBinarioAlternativa(num: Int): Int{
    var numDigitos = 0
    var numero = num
    while(numero != 0){
        numero = numero/2
        numDigitos +=1
        if(numero == 1){
            numDigitos += 1
            numero = 0
        }
    }
    return numDigitos
}

fun main() {
    println("Introduce el número: ")
    var numero = readLine()?.toInt()?: 0
    println("El número de dígitos necesarios para expresar $numero en binario es:"+cuentaBinario(numero))
    println("El número de dígitos necesarios para expresar $numero en binario es:"+cuentaBinarioAlternativa(numero))
}
