package com.aman.java.practice;

public class Java11TypeInference {
    public static void main(String[] args) {
        var result = m3();
        if(result > 99){
            System.out.println("greater");
        }
        else {
            System.out.println("not so greater");
        }
    }
    public static int m1(){
        return 100;
    }
    public static short m2(){
        return 100;
    }
    public static long m3(){
        return 97;
    }
}
