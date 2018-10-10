package com.nam.acmp_0692;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        if (MyFunc(n)){
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();
    }

    public static boolean MyFunc(int n){

        if (n == 1){
            return true;
        }
        for (int i = 2; i < 10000; i *= 2){
            if (n == i){
                return true;
            }
        }

        return false;
    }
}
