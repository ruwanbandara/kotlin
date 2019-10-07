fun main(args: Array<String>){
    val program3 = Program3()


    program3.reverseAndDisplay("Hello" ,{it.reversed()})




}

class Program3{
    fun reverseAndDisplay(str: String,myFunc:(String)-> String){ // High Level function with Lambda
        var result = myFunc(str)
        println(result)

    }
}