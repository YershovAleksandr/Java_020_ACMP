package com.nam.acmp_0131;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int oldestMan = -1;
        int index = -1;

        for (int i = 0; i < n; i++){
            int v = in.nextInt();
            int s = in.nextInt();

            if (s == 1){
                if (oldestMan < v){
                    oldestMan = v;
                    index = i;
                }
            }
        }

        out.println(index == -1?-1:index + 1);

        out.flush();
    }
}