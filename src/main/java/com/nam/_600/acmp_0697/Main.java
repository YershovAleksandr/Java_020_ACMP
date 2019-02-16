package com.nam._600.acmp_0697;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int l = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        int s = 2 * h * (w  + l);

        if ((s % 16) == 0){
            out.println(s / 16);
        } else {
            out.println(s / 16 + 1);
        }

        out.flush();
    }
}
