package com.nam.acmp_0637;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        List<Integer> instituteList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            instituteList.add(in.nextInt());
        }

        int k = in.nextInt();

        Collections.sort(instituteList);

        int rez = 0;

        for (int i = n - 1; i >= 0; i--){
            rez += Math.min(instituteList.get(i), k);

        }

        out.println(rez);

        out.flush();
    }
}
