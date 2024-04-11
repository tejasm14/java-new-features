package com.javafeature.java12;

import java.util.Arrays;
import java.util.List;

public class StringNewMethod {

    public static void main(String[] args) {

        String str = "**********\n  Welcome\n  Good Morning\n**********";

        System.out.println(str);
        System.out.println(str.indent(0));// will print the same string
        System.out.println(str.indent(3)); // will give the indent at the start of the string

        System.out.println("transform method");
        String string = "Java,Python,Angular";
        List<String> langList = string.transform(s -> Arrays.asList(s.split(",")));
        System.out.println(langList);

    }

}
