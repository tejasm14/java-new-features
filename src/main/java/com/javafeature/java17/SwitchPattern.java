package com.javafeature.java17;

public class SwitchPattern {

    public static void main(String[] args) {

        System.out.println(formatPatternSwitch(10.12));
    }

    public static String formatPatternSwitch(Object obj) {

        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d",l);
            case Double d -> String.format("double %f",d);
            case String s -> String.format("String %s",s);
            default -> obj.toString();
        };

    }








}
