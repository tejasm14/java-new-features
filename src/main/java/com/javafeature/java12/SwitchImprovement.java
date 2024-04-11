package com.javafeature.java12;

public class SwitchImprovement {

    static int getMealNumber(String meal) {

        int mealNumber = switch (meal) {

            case "SOUP" -> 1;
            case "BURGER", "CHIPS", "SANDWICH" -> 2;
            case "SPAGHETTI", "MACARONI" -> 3;
            default -> throw new IllegalStateException("");
        };

        return mealNumber;
    }

    public static void main(String[] args) {

        System.out.println("The meal number is : "+getMealNumber("BURGER"));
    }
}

