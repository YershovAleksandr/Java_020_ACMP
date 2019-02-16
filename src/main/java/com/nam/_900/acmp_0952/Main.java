package com.nam._900.acmp_0952;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();

        int min;// = n + (m - n);
        int max;

        if (n >= m){
            min = n;
        }else{
            min = n + m - n;
        }

        if (m > 0){
            max = n + m - 1;
        }else{
            max = n;
        }

        if (n == 0 && m > 0) {
            out.println("Impossible");
        }else if (n == 0 && m == 0){
            out.println("0 0");
        }else{
            out.println(String.format("%d %d", min, max));
        }

        out.flush();
    }
}