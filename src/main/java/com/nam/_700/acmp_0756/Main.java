package com.nam._700.acmp_0756;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n = in.nextInt();

        int rez = (m - 1) * (n - 1);

        out.println(rez);

        out.flush();
    }
}
