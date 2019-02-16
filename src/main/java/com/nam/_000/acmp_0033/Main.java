package com.nam._000.acmp_0033;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int garry = in.nextInt();

        int larry = in.nextInt();

        out.printf("%d %d", larry - 1, garry - 1);

        out.flush();
    }
}
