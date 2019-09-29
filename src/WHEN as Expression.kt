fun main (args: Array<String>){
    // When as Expression

    val x = 0

    when(x){
        0, 1 -> println("x is 0 or 1")
        2 -> println("x is 2")

        else ->{
            println("x value is unknown")
        }
    }
}