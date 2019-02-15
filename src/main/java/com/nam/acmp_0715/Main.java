package com.nam.acmp_0715;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int M = in.nextInt();

        String[] map1 = new String[N];
        String[] map2 = new String[N];

        for (int i = 0; i < N; i++){
            map1[i] = in.next();
        }

        for (int i = 0; i < N; i++){
            map2[i] = in.next();
        }

        int errors = 0;

        for (int i = 0; i < N; i++){
            for (int j = 0; j < map1[i].length(); j++){
                if (map1[i].charAt(j) == map2[i].charAt(j)){
                    errors++;
                }
            }
        }

        out.println(errors);

        out.flush();
    }
}