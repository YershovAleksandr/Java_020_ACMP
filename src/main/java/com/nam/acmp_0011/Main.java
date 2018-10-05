package com.nam.acmp_0011;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int n = in.nextInt();


        /*k = 1;
        n = 3;*/
        //1

       /* k = 2;
        n = 7;*/
        //21

/*        k = 3;
        n = 10;*/
        //274



        //int variants = MyFunc(k, n);

        //out.println(variants);

        //int n = 7;
        //int n = 10;

        int sum = 0;



        sum = MyFunc(k, n);

        //System.out.println("Result = " + sum);

        out.println(sum);

        out.flush();
    }

    public static int MyFunc(int k, int n){

        if (n == 0){
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= Math.min(k, n); ++i){

            //System.out.println();

            count += MyFunc(k, n - i);
        }

        return count;
    }

    public static long Factorial(int n){

        if (n == 0){
            return 1;
        } else {
            return n * Factorial(n -1);
        }

    }
}
