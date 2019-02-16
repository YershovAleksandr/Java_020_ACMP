package com.nam._600.acmp_0678;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static boolean inA;
    public static boolean inB;
    public static boolean inC;

    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        String s = in.next();

        inA = true;
        inB = false;
        inC = false;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                moveA();
            } else if (s.charAt(i) == 'B'){
                moveB();
            } else if (s.charAt(i) == 'C'){
                moveC();
            }
        }

        if (inA){
            out.println(1);
        }
        if (inB){
            out.println(2);
        }
        if (inC){
            out.println(3);
        }

        out.flush();
    }

    public static void moveA(){
        boolean tmp = inA;
        inA = inB;
        inB = tmp;
    }

    public static void moveB(){
        boolean tmp = inB;
        inB = inC;
        inC = tmp;
    }

    public static void moveC(){
        boolean tmp = inC;
        inC = inA;
        inA = tmp;
    }
}
