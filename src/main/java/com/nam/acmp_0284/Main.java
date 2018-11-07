package com.nam.acmp_0284;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        int m = in.nextInt();

        int[] iK = new int[m];
        int[] jK = new int[m];

        for (int i = 0; i < m; i++){
            iK[i] = in.nextInt();
            jK[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++){
            for (int j = iK[i] - 1; j <= jK[i] - 1; j++){
                out.printf("%d ", a[j]);
            }
            out.println();
        }

        out.flush();
    }
}
