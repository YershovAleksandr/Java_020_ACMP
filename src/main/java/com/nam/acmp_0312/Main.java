package com.nam.acmp_0312;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int n = in.nextInt();

        int d = a2 - a1;

        int an = a1 + (n - 1) * d;

        out.println(an);

        out.flush();
    }
}
