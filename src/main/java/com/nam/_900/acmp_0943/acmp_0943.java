package com.nam._900.acmp_0943;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp_0943 {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        int x = in.nextInt();

        if (y % 2 != 0){
            out.println(m * (y - 1) + x - 1);
        } else {
            out.println(m * y  - x);
        }

        out.flush();
    }
}
