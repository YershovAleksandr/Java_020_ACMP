package com.nam.acmp_0026;

import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int r1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int r2 = in.nextInt();

        int r = (int)sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        if (((r1 + r2) >= r) && ((r1 + r) >= r2) && (r2 + r) >= r1){
            out.println("YES");
        } else{
            out.println("NO");
        }

        out.flush();
    }
}