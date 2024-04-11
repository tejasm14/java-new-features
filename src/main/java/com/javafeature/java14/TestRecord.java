package com.javafeature.java14;

public class TestRecord {

    public static void main(String[] args) {

        //Here user is not normal class
        //Here User is Record
        User userobj = new User(101,"user123");
        User userobj2 = new User(102,"user1231");
        User userobj3 = new User(101,"user123");

        System.out.println(userobj);
        System.out.println(userobj2.equals(userobj3));
    }
}
