package com.nam._700.acmp_0755;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int result = x + y - z;

        if (result < 0){
            out.println("Impossible");
        } else {
            out.println(result);
        }

        out.flush();
    }
}
