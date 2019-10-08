fun main(array: Array<String>){

    var list = listOf<String>("Ruwan","Bandara","Wijepala") //immutable,Fixed Size,Read Only\

    var list2 = mutableListOf<String>()

    list2.add("Nimuth")
    list2.add("Virusara")

    list2.add("Silva")

    list2.remove("Silva")
    list2.add(2,"Test")

    for(index in 0..list.size -1){
     println(list[index])

    }

    println()

    for (element in list){
        println(element)
    }
    println()

    for (element in list2){
        println(element)
    }
}

