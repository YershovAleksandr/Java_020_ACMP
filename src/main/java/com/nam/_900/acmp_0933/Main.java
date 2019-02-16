package com.nam._900.acmp_0933;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int t = in.nextInt();

        out.println((t < a) ? b * t : b * a + c * (t - a));

        out.flush();
    }
}
