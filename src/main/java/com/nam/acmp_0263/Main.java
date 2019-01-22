package com.nam.acmp_0263;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();

        int temp = Math.abs(j - i);

        if (temp <= n / 2){
            out.println(temp - 1);
        }else{
            out.println(n - Math.abs(j - i) - 1);
        }

        out.flush();
    }
}
