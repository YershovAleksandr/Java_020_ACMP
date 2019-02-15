package com.nam.acmp_0294;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = 2;
        int M = 3;

        int[][] klm = new int[N][M];

        for (int j = 0;  j < N; j++){
            for (int i = 0; i < M; i++){
                klm[j][i] = in.nextInt();
            }
        }

        int sum1 = klm[0][0] * klm[0][1] / 100;
        int sum2 = klm[1][0] * klm[1][1] / 100;

        int rez1 = klm[0][0] - sum1;
        int rez2 = klm[1][0] - sum2;

        int sum3;
        if (rez1 > rez2){
            sum3 = (rez1 - rez2) * klm[0][2];
        }else{
            sum3 = (rez2 - rez1) * klm[1][2];
        }

        sum1 *= klm[0][2];
        sum2 *= klm[1][2];

        int rez = sum1 + sum2 + sum3;

        out.println(rez);

        out.flush();
    }
}