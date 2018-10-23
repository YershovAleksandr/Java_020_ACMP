package com.nam.acmp_0081;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int[] weights = new int[n];

        int min = 30_000;
        int max = 1;

        for (int i = 0; i < weights.length; i++){
            weights[i] = in.nextInt();

            if (weights[i] < min){
                min = weights[i];
            }
            if (weights[i] > max){
                max = weights[i];
            }
        }

        out.printf("%d %d", min, max);

        out.flush();
    }
}