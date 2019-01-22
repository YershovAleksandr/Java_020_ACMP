package com.nam.acmp_0844;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long a = in.nextLong();
        long b = in.nextLong();
        long s = a * b;

        long sqrt =  (long)Math.sqrt((double)s);

        if (sqrt * sqrt == s){
            out.println(sqrt);
        } else{
            out.println(0);
        }

        out.flush();
    }
}
