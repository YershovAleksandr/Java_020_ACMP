package com.nam.acmp_0777;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int s = in.nextInt();
        int t = in.nextInt();

        if (t > s){
            out.println(t- s);
        } else{
            out.println(12 - s + t);
        }

        out.flush();
    }
}
