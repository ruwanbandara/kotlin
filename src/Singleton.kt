fun main(args: Array<String>){

   // CustomerData.count =98
    //CustomerData.typeOfCustomer("Sri Lanaka")

    CustomerData.count =100
   var str1 = CustomerData.typeOfCustomer("America")

    println(CustomerData.count)
    println(str1)

    CustomerData.myMethod("Hello")

}

open class mySuperClass{
    open fun myMethod(str2:String){
        println("My SUPER CLASS")
    }
}

object CustomerData: mySuperClass(){
    var count:Int =1 // Behaves Like STATIC variable

    fun typeOfCustomer( str:String):String{
        return (str)
    }

    override fun myMethod(str2: String) {
            super.myMethod(str2)
            println("object Customer data: " +str2)


    }
}