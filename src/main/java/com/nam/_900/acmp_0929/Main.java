package com.nam._900.acmp_0929;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        long min = 0;
        long max = n * 6;

        if (n <= 6){
            min = 7 - n;
        } else {
            min = n / 6 + (n % 6 != 0?(7 - (n % 6)):0);
        }

        out.printf("%d %d", min, max);

        out.flush();
    }
}
