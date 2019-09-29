import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

fun main(args: Array<String>){
    val a =2
    val b =5

    var maxvalue:Int

    if(a>b){
        maxvalue = a
    }
    else{
        maxvalue = b
    }
    println(maxvalue)
}