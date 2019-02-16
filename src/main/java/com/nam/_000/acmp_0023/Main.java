package com.nam._000.acmp_0023;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int sum = 0;

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                sum += i;
            }
        }

        out.println(sum + 1 + n);

        out.flush();
    }
}
