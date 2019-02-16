package com.nam._000.acmp_0010;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();


        //System.out.println("A : " + a + " B : " + b + " C : " + c + " D : " + d);

        for (int i = -100; i <= 100; i++){
            if ((a * Math.pow(i, 3) + b * Math.pow(i, 2) + c * i + d) == 0){
                out.print(i + " ");
            }
        }


        out.flush();


    }
}
