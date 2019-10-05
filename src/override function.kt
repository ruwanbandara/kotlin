fun main(args: Array<String>){

    var dog = Dog3("Black", "Pug")

}

open class Animal3(var color:String){ //super class

    init {
        println("From Animal Init: $color")
    }

}

class Dog3(color: String, var bread:String):Animal3(color){ // Derived class
    init {
        println("From dog Init: $color and $bread")
    }

}

