package com.nam._900.acmp_0935;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        if (((Math.abs(x1 - x2) % 2 == 0) && (Math.abs(y1 - y2) % 2 == 0)) ||
                ((Math.abs(x1 - x2) % 2 == 1) && (Math.abs(y1 - y2) % 2 == 1))){
            out.println("YES");
        } else{
            out.println("NO");
        }

        out.flush();
    }
}