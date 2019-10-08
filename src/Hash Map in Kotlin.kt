fun main(args:Array<String>){

var myMap = HashMap<Int ,String>()  //Muatable , Read And Write both , no fixed size

    myMap.put(4,"Ruwan")
    myMap.put(7,"Bandara")
    myMap.put(8,"Wijepala")

    for (key in myMap.keys){
        println("Element at key: $key =${myMap[key]}")
    }

}
