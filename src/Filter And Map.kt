import com.Test.Person

fun main(args:Array<String>){

    val myNumber: List<Int> = listOf(2, 4, 5, 23, 90)

    val mySmallNumbers = myNumber.filter{it<10} // Or {Num -> Num<10}

    for (num in mySmallNumbers){
        println(num)

    }
    println()
    println()

    val mySquardeNumbers = myNumber.map { it*it } //OR {num -> num*num}

    for (num in mySquardeNumbers){
        println(num)
    }

    println()
    println()

    val mySmallSquaredNumbers =myNumber.filter { it<10 }.map { it*it }
    for (num in mySmallSquaredNumbers){
        println(num)
    }

    println()
    println()
    var people = listOf<Person>(Person("Ruwan"),Person("Bandara"), Person("Rvindu"))
    var names = people.filter { it.name.startsWith("R") }.map { it.name }

    for (name in names){
        println(name)
    }
}