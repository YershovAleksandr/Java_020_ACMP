package com.nam._300.acmp_0324;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String strN = in.nextLine();

        boolean isPolinom = true;
        for(int i = 0; i < strN.length() / 2; i++){
            if (strN.charAt(i) != strN.charAt(strN.length() - i - 1)){
               isPolinom = false;
               break;
            }
        }

        if (isPolinom){
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();
    }
}
