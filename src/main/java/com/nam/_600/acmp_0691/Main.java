package com.nam._600.acmp_0691;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String correctChars = "ABCEHKMOPTXY";
        String correctDigits = "0123456789";

        int n = in.nextInt();

        List<String> numberList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            numberList.add(in.next());
        }

        for (String s: numberList){
            if ((s.length() == 6) &&
                    (correctDigits.indexOf(s.charAt(1)) != -1) &&
                    (correctDigits.indexOf(s.charAt(2)) != -1) &&
                    (correctDigits.indexOf(s.charAt(3)) != -1) &&
                    (correctChars.indexOf(s.charAt(0)) != -1) &&
                    (correctChars.indexOf(s.charAt(4)) != -1) &&
                    (correctChars.indexOf(s.charAt(5)) != -1)){
                out.println("Yes");
            } else{
                out.println("No");
            }
        }

        out.flush();
    }
}
