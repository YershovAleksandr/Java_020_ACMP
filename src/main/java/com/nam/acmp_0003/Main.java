package com.nam.acmp_0003;

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

        if (5 == val) {
            return 25;
        }

        long firstPartValue = (val - 5) / 10;

        return (firstPartValue * (firstPartValue + 1)) * 100 + 25;
    }
}
