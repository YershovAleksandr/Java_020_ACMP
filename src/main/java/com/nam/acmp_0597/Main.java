package com.nam.acmp_0597;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int r1 = in.nextInt();
        int r2 = in.nextInt();
        int r3 = in.nextInt();

        if (r1 >= r2 + r3){
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();
    }
}
