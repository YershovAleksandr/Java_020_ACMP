package com.nam.acmp_0025;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b){
            out.println(">");
        } else if (a < b){
            out.println("<");
        } else {
            out.println("=");
        }

        out.flush();
    }
}
