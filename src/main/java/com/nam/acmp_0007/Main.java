package com.nam.acmp_0007;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        String str = in.nextLine();

        String[] vals = str.split(" ");

        for (String s : vals){
            System.out.println("Val = " + s);
        }

       /* BigDecimal val1 = in.nextBigDecimal();
        BigDecimal val2 = in.nextBigDecimal();
        BigDecimal val3 = in.nextBigDecimal();*/

        //in.nextBigDecimal()

        //BigDecimal bd = new BigDecimal("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");

        //bd.scaleByPowerOfTen(100);

        //bd. = 11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111;

        //System.out.println("Bd : " + bd);

//        System.out.println("Val1 : " + val1);
//        System.out.println("Val2 : " + val2);
//        System.out.println("Val3 : " + val3);

/*        if (val1.compareTo(val2) > 0){
            if (val1.compareTo(val3) > 0){
                out.println(val1);
            } else {
                out.println(val3);
            }
        } else {
            if (val2.compareTo(val3) > 0) {
                out.println(val2);
            } else {
                out.println(val3);
            }
        }*/

        out.flush();
    }

    public static boolean maxValue(String val1, String val2){
        if (val1.length() > val2.length()){

            return true;

        } else{

            return false;
        }


    }
}
