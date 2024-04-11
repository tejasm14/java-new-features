package com.javafeature.java17;

public class NullRelaxDemo {

    public static void main(String[] args) {
        testNullValue(null);
    }

    public static void testNullValue(String value) {
        if (value == null ) {
            System.out.println("Null value");
        }
        switch (value) {
            case "foo","bar" -> System.out.println("Great");
            default -> System.out.println("Ok");
        }
    }



}
