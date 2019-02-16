package com.nam._800.acmp_0817;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = in.nextLong();
        long m = in.nextLong();
        long d = in.nextLong();
        long k = in.nextLong();

        long s1 = n * d * k;
        long s2 = m * d * k;

        long ss = n * m * d * d;

        long rez = s1 + s2 - ss;

        out.println(rez);

        out.flush();
    }
}