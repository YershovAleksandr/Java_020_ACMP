package com.nam._000.acmp_0061;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int[] resA = new int[4];
        int[] resB = new int[4];

        int aWin = 0;
        int bWin = 0;

        for (int i = 0; i < 4; i++){
            resA[i] = in.nextInt();
            resB[i] = in.nextInt();

            aWin += resA[i];
            bWin += resB[i];
            /*if (resA[i] > resB[i]){
                aWin++;
            } else if (resA[i] < resB[i]){
                bWin++;
            }*/
        }

        if (aWin > bWin){
            out.println("1");
        } else if (bWin > aWin){
            out.println("2");
        } else {
            out.println("DRAW");
        }

        out.flush();
    }
}
