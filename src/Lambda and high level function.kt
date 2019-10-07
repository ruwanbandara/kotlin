fun main(args: Array<String>){
    val program1 = Program1()

    val MyLambda:(Int,Int)-> Int ={x:Int,y:Int -> x+y} //Lambda Expression[Function]
    program1.addTwoNumbers1(2,7,MyLambda)
    program1.addTwoNumbers1(2,7){x,y -> x+y}


}

class Program1{
    fun addTwoNumbers1(a:Int,b:Int, action: (Int,Int)-> Int){ // High Level function with Lambda
        val result = action(a,b) //x+y =a+b = 2+7 = 9
        println(result)
    }
}