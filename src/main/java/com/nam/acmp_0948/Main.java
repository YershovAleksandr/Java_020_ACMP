package com.nam.acmp_0948;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int n = in.nextInt();

        int pages = (n + k - 1) / k;
        int line = (n - 1) % k + 1;

        out.printf("%d %d", pages, line);

        out.flush();
    }
}
