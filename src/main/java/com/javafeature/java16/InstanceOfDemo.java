package com.javafeature.java16;

public class InstanceOfDemo {

    public static void main(String[] args) {
        System.out.println("Without instanceof operator change");
        withoutInstanceOfFeatureChange();
        System.out.println("-------------------------------------------------");
        System.out.println("With instanceof operator new feature");
        withInstanceOfFeature();

    }

    public static void withoutInstanceOfFeatureChange() {

        Object obj = "Hello World";
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str);
            System.out.println(str.length());
        }
    }

    public static void withInstanceOfFeature() {

        Object obj = "Hello World";
        if (obj instanceof String str) {
            System.out.println(str);
            System.out.println(str.length());
        }
    }



}

