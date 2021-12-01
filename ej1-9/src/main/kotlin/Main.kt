fun main() {
    println(
        readLine()?.split(",")?.fold(0)
        {acc,ele->
            //println ("=> $acc, $ele")
            acc+(ele?:"0").trim().toInt()
        }
    )
}