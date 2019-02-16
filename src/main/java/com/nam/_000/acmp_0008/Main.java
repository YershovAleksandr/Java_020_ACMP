package com.nam._000.acmp_0008;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] str){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a * b == c){
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();
    }
}
