fun serie(numero: Int){
    var listaPar = mutableListOf(-2)
    var listaImpar = mutableListOf(1)
    if(numero%2==0){
        for(i in 0..numero/2){
            listaPar.add(listaPar[i]-2)
            listaImpar.add(listaImpar[i]+2)
        }
    }
    var listafinal: MutableList<Int> = listaPar
    listafinal = listafinal.addAll(listaImpar)

}

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}