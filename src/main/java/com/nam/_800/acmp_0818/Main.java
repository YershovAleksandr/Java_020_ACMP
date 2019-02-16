package com.nam._800.acmp_0818;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int[] values = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++){
            values[i] = in.nextInt();
            sum += values[i];
        }

        int res = 0;

        if (n == 1){
            res = sum;
        } else{
            res = sum - n + 1;
        }

        out.println(res);

        out.flush();
    }
}
