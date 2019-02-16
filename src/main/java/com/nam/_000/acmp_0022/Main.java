package com.nam._000.acmp_0022;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int count = 0;

        while (n  > 0){
            if (n % 2 != 0){
                count++;
            }
            n /= 2;
        }

        out.println(count);

        out.flush();
    }
}
