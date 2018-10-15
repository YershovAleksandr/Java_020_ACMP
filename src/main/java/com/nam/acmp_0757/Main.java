package com.nam.acmp_0757;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        long c = in.nextLong();
        long h = in.nextLong();
        long o = in.nextLong();

        //long count = 2 * c + 6 * h + o;

        long count = Math.min(c / 2, h / 6);

        out.println(Math.min(count, o));

        out.flush();
    }
}
