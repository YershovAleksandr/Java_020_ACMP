package com.nam.acmp_0001;

import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();


        PrintWriter pw = new PrintWriter(System.out);
        pw.println(MyFunc(a, b));
        pw.flush();

        //System.out.println("C = " + c);

    }

    public static int MyFunc(int val1, int val2){
        return val1 + val2;
    }
}
