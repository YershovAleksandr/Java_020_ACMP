package com.nam.acmp_0147;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        long fib0 = 1;
        long fib1 = 1;
        long res = 0;

        if (n == 1 || n == 2){
            res = 1;
        }

        for (int i = 2; i < n; i++){
            res = fib0 + fib1;

            fib0 = fib1;
            fib1 = res;
        }

        out.println(res);

        out.flush();
    }
}

