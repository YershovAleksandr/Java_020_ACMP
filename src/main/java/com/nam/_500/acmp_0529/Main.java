package com.nam._500.acmp_0529;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int[] x = new int[2];
        int[] y = new int[2];

        for (int i = 0; i < 2; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        double length = Math.sqrt(Math.pow(Math.abs(x[1] - x[0]), 2)  +  Math.pow(Math.abs(y[1] - y[0]), 2));

        out.println(length);

        out.flush();
    }
}
