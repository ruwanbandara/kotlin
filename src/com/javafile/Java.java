package com.javafile;

import com.kotlinfile.KotlinKt;

public class Java {


    public static void main(String[] args){

        int sum = KotlinKt.add(4,5);
        System.out.println("Printin sum form java file:" +sum);
    }

    public static int getArea(int l,int b){
        return l*b;
    }
}
