fun main(args: Array<String>){

    //WAP to find out length of name
    val name:String? = null
   // val name:String = "Ruwan"


    //1. Safe call(?.)

        // Return the length if 'name' is not null else returns NULL
        //Use it if you don't mind  getting NULL value

    println("The length of name is ${name?.length}")



    // 2. Safe call with let( ?>let)

        //It executes the block ONLY IF name is NOT NULL
    name?.let { it ;String
        println("The length of name is ${name.length}")
    }


    // 3. Elvis-Operator (?:)

        //When we have nullable reference 'name', we can say "is name is not null", use it
        // otherwise use some non-null value
    val len = if (name!=null)
        name.length
    else
        -1


    val length = name?.length ?: -1
    println("The length of name is ${length}")


    // 4. Non-null assertion operator(!!)

        //Use it when you are sure the value is NOT NULL
        //Throws NullPointerException if the Value is found to be NULL

    println("The length of name is ${name!!.length}")

}
