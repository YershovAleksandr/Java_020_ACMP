package com.nam._000.acmp_0005;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int number = in.nextInt();

        int[] days = new int[number];

        for (int i = 0; i < number; i++){
            days[i] = in.nextInt();
        }

        //System.out.println("Number = " + number);

        //System.out.println("Days = " + Arrays.toString(days));

        List<Integer> oddDays = numberDays(days, true);
        //System.out.println("Odd days : " + oddDays.toString());
        for(Integer i : oddDays){
            System.out.print(i + " ");
        }

        List<Integer> notOddDays = numberDays(days, false);
//        System.out.println("Not Odd days : " + notOddDays.toString());
        System.out.println();
        for(Integer i : notOddDays){
            System.out.print(i + " ");
        }

        int numberOdd = 0;

        for (int i : days){
            if (isOdd(i)){
                numberOdd++;
            } else {
                numberOdd--;
            }
        }

        System.out.println();
        if (numberOdd <= 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean isOdd(int value){
        return value % 2 != 0;
    }

    public static List<Integer> numberDays(int[] days, boolean isOddDays){
        List<Integer> numberDays = new ArrayList<>();

        for (int i : days){
            if (isOddDays && isOdd(i)){
                numberDays.add(i);
            } else if (!isOddDays && !isOdd(i)){
                numberDays.add(i);
            }
        }

        return numberDays;
    }
}