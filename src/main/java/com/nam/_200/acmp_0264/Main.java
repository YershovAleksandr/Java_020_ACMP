package com.nam._200.acmp_0264;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();

        int otp = 0;
        int maxotp = 0;

        for (int i = 0; i < N; i++){
            int t = in.nextInt();

            if (t > 0){
                otp++;
            }else{
                otp = 0;
            }
            if (maxotp < otp){
                maxotp = otp;
            }
        }

        out.println(maxotp);

        out.flush();
    }
}