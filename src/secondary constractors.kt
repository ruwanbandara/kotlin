fun main(args: Array<String>){

    var student1 = Student1("Ruwan",8)
    print(student1.id)
}

class Student1(var name:String){

    var id: Int = -1

    init {
        println("student name get $name")
    }

    constructor(n:String, id:Int): this(n){
        this.id = id
    }
}