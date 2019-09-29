fun main (args: Array<String>){
    // When as Expression

    val x = 2

    when(x){
        1 -> println("x is 1")
        2 -> println("x is 2")

        else ->{
            println("x value is unknown")
        }
    }
}