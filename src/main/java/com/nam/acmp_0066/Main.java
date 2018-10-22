package com.nam.acmp_0066;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String keyboardChars = "qwertyuiopasdfghjklzxcvbnm";

        char c = in.next().charAt(0);

        for (int i = 0; i < keyboardChars.length(); i++){
            if (keyboardChars.charAt(i) == c){
                if (i < keyboardChars.length() - 1){
                    out.println(keyboardChars.charAt(i + 1));
                    break;
                } else {
                    out.println(keyboardChars.charAt(0));
                    break;
                }
            }
        }

        out.flush();
    }
}
