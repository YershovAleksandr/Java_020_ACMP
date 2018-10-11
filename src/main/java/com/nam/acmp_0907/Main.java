package com.nam.acmp_0907;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        long width = in.nextLong();
        long height = in.nextLong();
        long radius = in.nextLong();

        if (Math.min(width, height) >= 2 * radius){
            out.println("YES");
        } else{
            out.println("NO");
        }

        out.flush();
    }
}
