package com.javafeature.java16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DayPeriodSupport {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate.now() : "+localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime.now() : "+localDateTime);

        String currentTime = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, hh:mm:ss a", Locale.US).format(LocalDateTime.now());
        System.out.println(currentTime); // output : Thursday, April 4, 2024, 01:29:04 PM

        //B is the new day period support added in the java 16
        String currentTimeDayPeriod = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, hh:mm:ss B", Locale.US).format(LocalDateTime.now());
        System.out.println(currentTimeDayPeriod);//output : Thursday, April 4, 2024, 01:29:04 in the afternoon


    }
}
