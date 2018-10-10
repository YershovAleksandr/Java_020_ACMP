package com.nam.acmp_0539;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        if (n == 1){
            out.println(0);
        } else if ((n % 2) == 0){
            out.println(n / 2);
        } else {
            out.println(n);
        }

        out.flush();
    }
}
