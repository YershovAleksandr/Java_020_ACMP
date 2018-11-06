package com.nam.acmp_0148;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        /*int min = Math.min(a, b);

        for (int i = min; i >= 1; i--){
            if (a % i == 0 && b % i == 0){
                out.println(i);
                break;
            }
        }*/

        while (a != 0 && b != 0){
            if (a > b){
                a %= b;
            } else {
                b %= a;
            }
        }

        out.println(a + b);

        out.flush();
    }
}
