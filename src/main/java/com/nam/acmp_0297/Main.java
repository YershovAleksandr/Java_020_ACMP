package com.nam.acmp_0297;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str = in.next();

        int n = 0;

        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i) == '0') || (str.charAt(i) == '6') || (str.charAt(i) == '9')){
                n++;
            }
            if (str.charAt(i) == '8'){
                n += 2;
            }
        }

        out.println(n);

        out.flush();
    }
}
