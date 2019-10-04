fun main(args: Array<String>){
    val x:Int = 6
    val y:Int =12

    val greaterVal = x greaterValue1 y
    println(greaterVal)
}

infix fun Int.greaterValue1(other:Int):Int{
    if(this>other)
        return this
    else
        return other
}