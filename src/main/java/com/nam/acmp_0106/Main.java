package com.nam.acmp_0106;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int[] coins = new int[n];

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < coins.length; i++){
            coins[i] = in.nextInt();

            if (coins[i] == 1){
                heads++;
            } else {
                tails++;
            }
        }

        out.println(Math.min(heads, tails));

        out.flush();
    }
}
