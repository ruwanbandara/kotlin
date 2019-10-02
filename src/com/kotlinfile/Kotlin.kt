package com.kotlinfile

import com.javafile.Java

fun main(args: Array<String>){
    var area = Java.getArea(10,5);
    println("Printing form kotlin file :" +area)

}

 fun add(a:Int, b:Int): Int {
    return a + b
}
