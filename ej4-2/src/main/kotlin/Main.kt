fun main() {
    var listaNumeros = mutableListOf<Int>()
    var continuar = true
    while(continuar){
        println("Introduce un numero: ")
        var lectura = readLine()
        if(lectura!="fin"){
            var numero = lectura?.toInt()?: "n"
            if(numero=="n"){
                println("Incorrecto")
            }
            else{
                listaNumeros.add(lectura?.toInt()?: 0)
            }
        }
        else{
            continuar = false
        }
    }
    var suma = 0
    for(i in 0..listaNumeros.size-1){
        suma = suma+listaNumeros[i]
    }
    println("La suma de todos los numeros es: "+suma)
    println("La cantidad de numeros introducidos es: "+listaNumeros.size)
    println("La media de los numeros es: "+suma/listaNumeros.size)

}