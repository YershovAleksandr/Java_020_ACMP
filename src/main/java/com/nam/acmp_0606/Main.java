package com.nam.acmp_0606;

import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if ((x + y > z) && (x + z > y) && (y + z > x)){
            out.println("YES");
        } else{
            out.println("NO");
        }

        out.flush();
    }
}
