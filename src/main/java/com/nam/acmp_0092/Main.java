package com.nam.acmp_0092;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int s = in.nextInt();

        out.printf("%d %d %d", s / 6, 2 * s / 3, s / 6);

        out.flush();
    }
}
