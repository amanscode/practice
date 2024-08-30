package com.aman.java.practice;

import java.util.ArrayList;

public class Java11StringFeatures {
    public static void main(String[] args) {
        String s = "  aman   ";
        System.out.println(s);
        String s1 = s.stripTrailing();
        System.out.println(s1);
        String s2 = s.stripLeading();
        System.out.println(s2);
        String s3 = s.strip();
        System.out.println(s3);
        String s4 = s3.repeat(3);
        System.out.println(s4);

        String s5 = "  ";
        System.out.println("isBlank: " + s5.isBlank() + " isEmpty: " + s5.isEmpty());

        var list = new ArrayList<String>();
        list.add("abc"); list.add("def"); list.add("ghi"); list.add("jkl"); list.add("mno");
        var arrayFromList = list.toArray(String[]::new);
        System.out.println("array length: " + arrayFromList.length);
        System.out.println("array third element: " + arrayFromList[2]);
    }
}
