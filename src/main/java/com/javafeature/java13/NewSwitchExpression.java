package com.javafeature.java13;

public class NewSwitchExpression {

    public static void main(String[] args) {

        System.out.println("Monday : "+getDayValue("Monday"));
        System.out.println("Sunday : "+getDayValue("Sunday"));
        System.out.println("testas : "+getDayValue("testas"));

    }

    public static String getDayValue(String day) {

        return switch (day) {

            // yield statement returns the value and finishes the switch execution.
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> {
                System.out.println("In Weekdays");
                yield "Weekday";
            }

            // yield statement returns the value and finishes the switch execution.
            case "Saturday","Sunday" -> {
                System.out.println("In Weekends");
                yield "Weekend";
            }
            default -> throw new IllegalStateException("Invalid day : "+day);
        };

    }

}
