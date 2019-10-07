fun main(args: Array<String>){
    val program2 = Program2()

    var result1 = 0

  //  val MyLambda:(Int,Int)-> Int ={x:Int,y:Int -> x+y} //Lambda Expression[Function]
 //   program2.addTwoNumbers1(2,7,MyLambda)
    program2.addTwoNumbers1(2,7){x,y -> result1 = x+y}
    println(result1)


}

class Program2{
    fun addTwoNumbers1(a:Int,b:Int, action: (Int,Int)-> Unit){ // High Level function with Lambda
         action(a,b) // result1 = x+y = a+b = 2+7 = 9

    }
}