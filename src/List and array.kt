fun main(array: Array<String>){

    var list = listOf<String>("Ruwan","Bandara","Wijepala") //immutable,Fixed Size,Read Only\




    for(index in 0..list.size -1){
     println(list[index])

    }

    println()

    for (element in list){
        println(element)
    }
}

