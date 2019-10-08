fun main(args: Array<String>){

    val myNumberes = listOf(2,3,4,6,23,90)

    val check1 = myNumberes.all { it>10 } // Are all element greater than 10?
    println(check1)

    val check2 =myNumberes.any({ it>10}) //Does any thede element satisfy the Predicate?
    println(check2)

    val totalCount:Int = myNumberes.count{it>10} // Number of element that satisfy the Predicate
    println(totalCount)

    val num = myNumberes.find { it > 10 } // return the first number that matches the Predicate
    println(num)


}