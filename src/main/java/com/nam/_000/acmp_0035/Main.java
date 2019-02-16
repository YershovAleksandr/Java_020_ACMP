package com.nam._000.acmp_0035;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();

        int n[] = new int[k];
        int m[] = new int[k];

        for (int i = 0; i < k; i++){
            n[i] = in.nextInt();
            m[i] = in.nextInt();
        }

        for (int i = 0; i < k; i++){
            long d = 19 * m[i] + (n[i] + 239) * (n[i] + 366) / 2;
            out.println(d);
        }

        out.flush();
    }
}
