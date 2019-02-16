package com.nam._800.acmp_0819;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        long s = 2 * ( a * b + a * c + b * c);

        long v = a * b * c;

        out.printf("%d %d", s , v);

        out.flush();
    }
}
