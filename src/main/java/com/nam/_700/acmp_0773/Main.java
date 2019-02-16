package com.nam._700.acmp_0773;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();

        int m = in.nextInt();

        out.println(k * k * m);

        out.flush();
    }
}
