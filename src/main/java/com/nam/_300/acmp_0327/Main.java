package com.nam._300.acmp_0327;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        String[] str = new String[k];

        for (int i = 0; i < k; i++){
            str[i] = in.next();
        }

        for (int i = 0; i < k; i++){
            int leftPart = 0;

            for (int j = 0; j < 3; j++){
                leftPart += Character.getNumericValue(str[i].charAt(j));
            }

            int rightPart = 0;

            for (int j = 3; j < 6; j++){
                rightPart += Character.getNumericValue(str[i].charAt(j));
            }

            if (leftPart < rightPart){
                if (str[i].charAt(5) != '0'){
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            } else if (leftPart > rightPart){
                if (str[i].charAt(5) != '9'){
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }
        }

        out.flush();
    }
}
