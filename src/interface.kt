fun main(args: Array<String>){

    var mybtn = Button()
    mybtn.onTouch()
    mybtn.onClick()


}

interface MyInterfaceListener{

    var name:String  // properties in interface are abstract by default

    abstract fun onTouch() //Methods in interface are abstract by default

    fun onClick(){
        // Nomal methods are public and open by default Not final

        println("onClick interface code: Button clicked")
    }


}
class Button:MyInterfaceListener{
    //body
    override var name:String="Ruwan"

    override fun onTouch() {
        //

        println("Button was touched")
    }
    override fun onClick(){
        super.onClick()
        println("Button is click")
    }
}

