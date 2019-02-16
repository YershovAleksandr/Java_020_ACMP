package com.nam._100.acmp_0149;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        List<Integer> vals = new ArrayList<>();

        for (int i = 0; i < n; i++){
            vals.add(in.nextInt());
        }

        for (int i = n - 1; i >= 0; i--){
            out.printf("%d ", vals.get(i));
        }

        out.flush();
    }
}
