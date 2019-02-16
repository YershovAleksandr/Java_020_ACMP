package com.nam._000.acmp_0002;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(System.out);

        pw.println(MyFunc(in.nextInt()));

        pw.flush();

    }

    public static long MyFunc(int val){

        long result = 0;

        if (val > 0) {
            for (int i = 1; i <= val; i++) {
                result += i;
            }
        } else {

            for (int i = 1; i >= val; i--){
                result += i;
            }

        }
        return result;
    }
}
