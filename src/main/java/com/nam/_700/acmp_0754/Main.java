package com.nam._700.acmp_0754;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int[] m = new int[3];

        int maxWeight = 0;
        int minWeight = 10_000;

        for (int i = 0; i < 3; i++){
            m[i] = in.nextInt();
            if (maxWeight < m[i]){
                maxWeight = m[i];
            }
            if (minWeight > m[i]){
                minWeight = m[i];
            }
        }

        if (maxWeight > 727 || minWeight < 94){
            out.println("Error");
        } else {
            out.println(maxWeight);
        }

        out.flush();
    }
}
