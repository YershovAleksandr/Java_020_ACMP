package com.nam._000.acmp_0086;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n == 1){
            out.println(0);
        } else {
            out.println(n * n - ((3 * n) - 2));
        }

        out.flush();
    }
}
