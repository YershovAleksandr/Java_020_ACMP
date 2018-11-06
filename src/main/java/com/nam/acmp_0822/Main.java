package com.nam.acmp_0822;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in  = new Scanner(System.in);

        int x[] = new int[3];
        int y[] = new int[3];

        for (int i = 0; i < 3; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        double square = 0.0;

        double a = Math.sqrt(Math.pow(x[1] - x[0],2) + Math.pow(y[1] - y[0], 2));
        double b = Math.sqrt(Math.pow(x[2] - x[1],2) + Math.pow(y[2] - y[1], 2));
        double c = Math.sqrt(Math.pow(x[2] - x[0],2) + Math.pow(y[2] - y[0], 2));

        double p =  0.5 * (a + b + c);

        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        Locale.setDefault(new Locale("en", "EN"));

        out.printf("%.1f", square);

        out.flush();
    }
}
