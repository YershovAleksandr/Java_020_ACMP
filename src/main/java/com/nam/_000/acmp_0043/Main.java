package com.nam._000.acmp_0043;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str = in.next();

        int length = 0;
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '0'){
                length++;
            } else{
                length = 0;
            }
            if (maxLength < length){
                maxLength = length;
            }
        }

        out.println(maxLength);

        out.flush();
    }
}
