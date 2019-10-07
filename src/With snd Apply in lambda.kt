fun main(args: Array<String>){

    var employee = Employee()

    with(employee){
        name = "Ruwan"
        age = 23
    }

    employee.apply {
        name = "Bandara"
        age = 24
    }.startRun()

    println(employee.name)
    println(employee.age)
}

class Employee{
    var name:String=""
    var age:Int = -1

    fun  startRun(){
        println(" Now I am ready to run")
    }
}

