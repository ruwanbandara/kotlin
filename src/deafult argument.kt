fun main(args: Array<String>){

    fun findvolume(length:Int, brandth:Int, height:Int =10):Int{
        return length*brandth*height
    }

    var result= findvolume(10,20)
    print(result)   //10*20*10 = 2000
}