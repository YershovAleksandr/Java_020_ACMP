package com.nam._000.acmp_0004;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);


        out.println(MyFunc(in.nextInt()));

        out.flush();

    }

    public static int MyFunc(int val){

        int part1 = val;
        int part2 = 9;
        int part3 = part2 - part1;

        return 100 * part1 + 10 * part2 + part3;
    }
}
