fun main(args:Array<String>){
    var myMap = mapOf<Int,String>(4 to "Ruwan", 43 to "Bandara", 50 to "Wijepala")  //imutable, fixed size , Read only

    for (key in myMap.keys){ //Using Indivual Element (Object)

        println(myMap[key])
    }

    println()

    for (key in myMap.keys){ //Using Indivual Element (Object)

        println("Element at key:$key = ${myMap.get(key)}") // map.get(Key)
    }
}
