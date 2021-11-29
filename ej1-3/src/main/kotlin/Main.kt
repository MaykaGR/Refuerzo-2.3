import kotlin.io.println as println

fun main(args: Array<String>) {
   val ancho = 17
   val alto = 12.0
    var temporal2: Double
    var temporal= ancho/2
    println(temporal)
    //Mostrará 8, porque al ser ancho un Int, sobreentiende que el resultado debe ser Int
    temporal = ancho // 2
    println (temporal)
    //Mostrará 17 (porque al haber doble // se coge el 2 como comentario)
    temporal2 = alto / 3
    println (temporal2)
    //Mostrará 4.0
    temporal = 1 + 2 * 5
    println (temporal)
    //Mostrará 11

}