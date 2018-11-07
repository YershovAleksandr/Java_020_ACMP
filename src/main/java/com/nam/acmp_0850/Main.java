package com.nam.acmp_0850;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int min = Math.max(a, b) / 2 + Math.max(a, b) % 2;
        int max = Math.min(a, b);

        out.printf("%d %d", min, max);

        out.flush();
    }
}
