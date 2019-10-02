fun main(args:Array<String>){
    var largeNumber = max(4,6)

    println("The large Number is : $largeNumber")
}

fun max(a:Int , b:Int):Int
   = if (a>b){
        a
    }else
    {
        b
    }
