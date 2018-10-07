package com.nam.acmp_0021;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        List<Integer> employeers = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            employeers.add(in.nextInt());
        }

        int max = 0;
        int min = 1_000_000;


        for (int i : employeers){
            if (i > max){
                max = i;
            }

            if (i < min){
                min = i;
            }
        }

        out.println(max - min);

        out.flush();
    }
}
