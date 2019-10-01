fun main(args: Array<String>){
    for (i in 1..3){
        for(j in 1..3){
            if(i==2 && j==2)
                continue
            println("$i $j")
        }
    }
}