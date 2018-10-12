package com.nam.acmp_0970;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long[] vars = new long[3];

        for (int i = 0; i < vars.length; i++){
            vars[i] = in.nextLong();
        }

        if ((vars[0] + vars[1] == vars[2]) || (vars[0] + vars[2] == vars[1]) || (vars[1] + vars[2] == vars[0])){
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();
    }
}
