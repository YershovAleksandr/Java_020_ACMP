package com.nam.acmp_0007;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        String str = in.nextLine();

        String[] vals = str.split(" ");

        for (String s : vals){
            //System.out.println("Val = " + s);

            s = checkValue(s);

            //System.out.println("Val = " + s);
        }



        if (maxValue(vals[0], vals[1])){
            if (maxValue(vals[0], vals[2])){
                out.println(vals[0]);
            } else {
                out.println(vals[2]);
            }
        } else {
            if (maxValue(vals[1], vals[2])){
                out.println(vals[1]);
            } else {
                out.println(vals[2]);
            }
        }

        out.flush();
    }

    public static boolean maxValue(String val1, String val2){
        if (val1.length() > val2.length()){
            return true;
        } else if (val1.length() < val2.length()){
            return false;
        }
        if (val1.compareTo(val2) >= 0){
            return true;
        } else {
            return false;
        }
    }

    public static String checkValue(String val){

        boolean firstZero = true;

        StringBuilder sb = new StringBuilder(val);

        int index = 0;

        for (int i = 0; i < val.length(); i++){
            if (val.charAt(i) == '0' && firstZero){
                sb.deleteCharAt(i - index);
                index++;
            } else {
                firstZero = false;
            }
        }

        return sb.toString();
    }
}
