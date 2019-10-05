fun main(args: Array<String>){

    var dog = Dog6("Black","pug")
}

open class Animal6{
    var color:String =""
    constructor(color:String){
        this.color = color

        println( "Form Animal: $color")
    }
}

class Dog6:Animal6{
    var bread:String=""
    constructor(color: String,bread:String):super(color){
        this.bread = bread
        println("Form Dog :$color and $bread")
    }

}