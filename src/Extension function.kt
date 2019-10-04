fun main(args: Array<String>){

    val str1:String = "Hello "
    val str2:String = "word "
    val str3:String = "Hey "


    println(str3.add(str1 ,str2))
}

fun String.add(s1:String, s2:String):String{
    return this + s1 +s2
}