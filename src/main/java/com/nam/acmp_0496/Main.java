package com.nam.acmp_0496;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++){
            a[i] = in.nextInt();
        }

        int sum = 0;
        int maxsum = 0;

        for (int i = 0; i < N; i++){

            if (i == 0){
                sum = a[N-1] + a[i] + a[i+1];
            }else if (i == N - 1){
                sum = a[N-2] + a[N - 1] + a[0];
            } else {
                sum = a[i - 1] + a[i] + a[i + 1];
            }

            if (sum > maxsum){
                maxsum = sum;
            }

            sum = 0;
        }

        out.println(maxsum);

        out.flush();
    }
}