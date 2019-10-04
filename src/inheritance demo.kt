fun main(args: Array<String>){

    var dog =Dog()
    dog.bread ="labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    println("Dog color is  " +dog.color)

    var cat = Cat()
    cat.age = 5
    cat.color ="brown"
    cat.meow()
    cat.eat()

    println("Cat color is  " +cat.color)

    var animal = Animal()
    animal.eat()
    animal.color="White"

    println("Animal color is  " +animal.color)

}

open class Animal{

    var color:String=""
    fun eat(){
        println("Eat")
    }
}

class Dog:Animal(){
    var bread:String=""

    fun bark(){
        println("Bark")
    }
}

class Cat:Animal(){
    var age:Int =-1

    fun meow(){
        println("Meow")
    }
}