package com.nam.acmp_0894;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        PrintWriter out = new PrintWriter(System.out);

        float squareRing = in.nextFloat();
        float radiusBig = in.nextFloat();

        float squareBig = (float)Math.PI * (float)Math.pow(radiusBig, 2);
        float squareSmall = squareBig - squareRing;
        float radiusSmall = (float)Math.sqrt(squareSmall / Math.PI);

        out.printf(Locale.US, "%.3f", radiusSmall);

        out.flush();
    }
}
