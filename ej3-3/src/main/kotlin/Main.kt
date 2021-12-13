import kotlin.math.*
fun distancia(Ax: Double, Ay: Double, Bx: Double, By: Double): Double {
 val distancia = sqrt(((Ax-Bx)*2)+((Ay-By)*2))
    return distancia}
fun main() {
    val puntoAx = 1.00
    val puntoAy = 2.00
    val puntoBx = 0.50
    val puntoBy = 1.10
    println(distancia(puntoAx,puntoAy,puntoBx,puntoBy))

}