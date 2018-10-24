package com.nam.acmp_0839;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str = in.next();

        int strLength = str.length();

        boolean flag = false;

        for (int i = 0; i < strLength; i++){
            if (str.charAt(i) == '0'){
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.println("NO");
        } else{
            System.out.println("YES");
        }

        out.flush();
    }
}
