package com.nam._900.acmp_0903;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        out.print(in.nextLong() + 1);

        out.flush();
    }
}
