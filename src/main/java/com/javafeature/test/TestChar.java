package com.javafeature.test;

public class TestChar {

    public static void main(String[] args) {
        System.out.println((char)'a');

        String abc = "abc"+12+32;

        String test = String.valueOf(12+32);
        System.out.println(abc);
        System.out.println(test);
    }


    public boolean test(int a, int b) {
        if (b>a) {
            return true;
        } else {
            return false;
        }
    }
}
