
fun main() {
  println("Introduzca puntuación entre 0.0 y 1.0: ")
    var puntuacion=readLine()?.toDouble()?:0.00
    println (when(puntuacion){
        /*puntuacion >= 0.9 ->	"Sobresaliente"
        puntuacion >= 0.8 ->	"Notable"
        puntuacion >= 0.7 ->	"Bien"
        puntuacion >= 0.6 ->	"Suficiente"
        puntuacion < 0.6 ->	    "Insuficiente"*/
        in 0.90.rangeTo(1.00) -> "Sobresaliente"
        in 0.80..0.89 -> "Notable"
        in 0.70..0.79 -> "Bien"
        in 0.60..0.69 -> "Suficiente"
        in 0.59..0.00 -> "Insuficiente"
        else -> "Error, puntuación fuera de rango"
    })
}