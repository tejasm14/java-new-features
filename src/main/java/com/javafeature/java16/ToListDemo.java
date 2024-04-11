package com.javafeature.java16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListDemo {

    public static void main(String[] args) {

        System.out.println("before using toList() method");
        beforeToList();
        System.out.println("using toList() method");
        afterToList();

    }

    public static void beforeToList() {

        List<String> list = Arrays.asList("10","20","30");
        List<Integer> integerList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(integerList);
    }

    public static void afterToList() {
        List<String> list = Arrays.asList("10","20","30");
        List<Integer> integerList = list.stream().map(Integer::parseInt).toList();
        System.out.println(integerList);
    }


}
