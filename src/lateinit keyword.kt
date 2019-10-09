fun main(args: Array<String>){
    val country = Contry()

    country.setup()



}

class Contry{
    lateinit var name: String

    fun setup(){
        name = "Sri Lanka"
        println("The name of country is $name")
    }
}

//lateinit used only with mutable data type [var]
//lateinit used only with non - nullable data type
//lateinit values must be initialised before you use it
