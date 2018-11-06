package com.nam.acmp_0062;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        String s = in.next();

        String res[] = {"BLACK", "WHITE"};

        int row = Character.getNumericValue(s.charAt(1));

        int col = 0;

        switch (s.charAt(0)){
            case 'A' : col = 1; break;
            case 'B' : col = 2; break;
            case 'C' : col = 3; break;
            case 'D' : col = 4; break;
            case 'E' : col = 5; break;
            case 'F' : col = 6; break;
            case 'G' : col = 7; break;
            case 'H' : col = 8; break;
        }

        //out.printf("%d %d\n", row, col);

        if ((row % 2 == 0) && (col % 2 != 0) || (row % 2 != 0) && (col % 2 == 0)){
            out.println(res[1]);
        } else {
            out.println(res[0]);
        }

        out.flush();
    }
}
