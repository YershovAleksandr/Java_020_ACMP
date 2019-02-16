package com.nam._000.acmp_0052;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String number = in.next();

        int leftSum = 0;
        int rightSum = 0;

        if (Integer.parseInt(number) == 0){
            out.println("YES");
        } else {
            for (int i = 0; i < 3; i ++) {
                leftSum += Integer.parseInt(Character.toString(number.charAt(i)));
                rightSum += Integer.parseInt(Character.toString(number.charAt(i + 3)));
            }

            if (leftSum == rightSum){
                out.println("YES");
            } else {
                out.println("NO");
            }
        }

        out.flush();
    }
}
