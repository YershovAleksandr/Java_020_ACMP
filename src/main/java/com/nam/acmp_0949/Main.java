package com.nam.acmp_0949;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        long an = in.nextLong();
        long an1 = in.nextLong();

        long anm1 = an1 - an;

        int nn = N;

        while(nn >= 3){
            an1 = an;
            an = anm1;

            anm1 = an1 - an;
            nn--;
        }

        if (N == 1){
            out.println(an + " " + an1);
        }else {
            out.println(anm1 + " " + an);
        }

        out.flush();
    }
}