package com.nam.acmp_0685;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            a.add(in.nextInt());
        }

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            b.add(in.nextInt());
        }

        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        b.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        int sum = 0;

        for (int i = 0; i < a.size(); i++){
            sum += a.get(i) * b.get(i);
        }

        out.println(sum);

        out.flush();
    }
}
