fun main(args: Array<String>){

    var myArray = Array<Int>(5){0}  // Mutable Fixed Size.
    myArray[0] =32
    myArray[3] = 50


    for (element in myArray){ // using Induvidual element(Object)

        println(element)

    }

    println()

    for (index in 0..myArray.size -1){
        println(myArray[index])
    }



}