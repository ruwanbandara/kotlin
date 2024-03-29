package com.kotlin




 fun main(args: Array<String>){

     val program = Program()

     program.addTwoNumbers(2,7) //simple way .. better Understatanding

     program.addTwoNumbers(2,7, object: MyInterface1{
         override fun execute(Sum: Int) {
             println(Sum)
         }

     })

     var test: String = "Hello"
     val myLambda: (Int)-> Unit  = {s: Int -> println(s)}
     program.addTwoNumbers(2,7, myLambda)
 }

class Program{

    fun addTwoNumbers(a:Int , b:Int,action: (Int) -> Unit){ // High level function with Lambda as parameter
        val sum = a+b
        println(sum)
    }

    fun addTwoNumbers(a:Int , b:Int, action:MyInterface1){  // Using Interface / object orinted way
        val sum = a+b
        action.execute(sum)
    }


    fun addTwoNumbers(a:Int , b:Int){ // simple way .. Just for better Understanding
        val sum = a+b
        println(sum)
    }

}

interface MyInterface1{
    fun execute(Sum:Int)
}
