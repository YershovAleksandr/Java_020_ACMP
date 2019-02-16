package com.nam._500.acmp_0504;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();

        if (k % 3 == 1){
            out.println("VGC");
        } else if (k % 3 == 2){
            out.println("CVG");
        } else if (k % 3 == 0){
            out.println("GCV");
        }

        out.flush();
    }
}
