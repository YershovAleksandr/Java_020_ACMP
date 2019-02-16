package com.nam._200.acmp_0233;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int[] bridgeHeight = new int[n];

        int crashBridge = -1;

        for (int i = 0; i < n; i++){
            bridgeHeight[i] = in.nextInt();

            if (bridgeHeight[i] <= 437){
                crashBridge = i;
                break;
            }
        }

        if (crashBridge != -1){
            out.println("Crash " + (crashBridge + 1));
        } else{
            out.println("No crash");
        }

        out.flush();
    }
}
