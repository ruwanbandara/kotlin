fun main(args: Array<String>){

    var dog = Dog4("Black", "Pug")

}

open class Animal4(var color:String){ //super class

    init {
        println("From Animal Init: $color")
    }

}

class Dog4(color: String, var bread:String):Animal4(color){ // Derived class
    init {
        println("From dog Init: $color and $bread")
    }

}

