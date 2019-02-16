package com.nam._900.acmp_0940;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();

        String s = in.next();

        for (int i = 0; i < s.length(); i++){
            if (i != k - 1){
                out.print(s.charAt(i));
            }
        }

        out.flush();
    }
}
