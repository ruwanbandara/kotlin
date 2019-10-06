fun main(args: Array<String>){
    var user1 = User("Ruwan",10)
    var user2 = User("Ruwan",10)

    if (user1==user2){
        println("Equal") // use data class because print equal
    }else
    {
        println("Not Equal")
    }

    println(user1) // if data class use that print only data  not address

    var newUser = user1.copy("Bandara")
    println(newUser)
}

data class User(var name:String, var id:Int){



}

