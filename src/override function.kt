fun main(args: Array<String>){

  var dog = Dog1()
    dog.eat()

    var cat = Cat1()
    cat.eat()  //override function
}

open class Animal1{

    var color:String=""
   open fun eat(){
        println("Eat")
    }
}

class Dog1:Animal1(){
    var bread:String=""

    fun bark(){
        println("Bark")
    }
}

class Cat1:Animal1(){
    var age:Int =-1

    fun meow(){
        println("Meow")
    }

    override fun eat(){
        println("Cat is Eating")
    }
}