package com.nam.acmp_0766;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        if (n * m >= k){
            out.println("YES");
        } else{
            out.println("NO");
        }

        out.flush();
    }
}
