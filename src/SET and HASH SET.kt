fun main(args: Array<String>){

    //"Set" contains unique elements
    //"HashSet" also contains unique elements but Sequence is not guaranted in output

    var mySet1 = setOf<Int>(2,50,30,40,1,3,3,3,5)//immutable, Read only

    var mySet2 = mutableSetOf<Int>(2,50,30,40,1,3,3,3,5) //Mutable set. Read abd write both
    var mySet3 = hashSetOf<Int>(2,50,30,40,1,3,3,3,5)  //Mutable set. Read abd write both

    mySet3.add(25)
    mySet3.remove(30)
    for (element in mySet1){
        println(element)
    }

    println()
    println()
    for (element in mySet2){
        println(element)
    }
    println()
    println()
    for (element in mySet3){
        println(element)
    }
}