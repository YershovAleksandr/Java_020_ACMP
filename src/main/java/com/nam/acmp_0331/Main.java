package com.nam.acmp_0331;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String startTime = in.next();
        int hours = in.nextInt();
        int minutes = in.nextInt();

        int startHours = Character.getNumericValue(startTime.charAt(0)) * 10 + Character.getNumericValue(startTime.charAt(1));
        int startMinutes = Character.getNumericValue(startTime.charAt(3)) * 10 + Character.getNumericValue(startTime.charAt(4));

        int stopHours = (startHours + hours) % 24;
        int stopMinutes = startMinutes + minutes;
        if (startMinutes + minutes >= 60){
            stopHours++;

            stopMinutes %= 60;
        }
        if (stopHours >= 24){
            stopHours = 0;
        }

        System.out.printf("%02d:%02d", stopHours, stopMinutes);

        out.flush();
    }
}