package com.nam._000.acmp_0006;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        String step = in.nextLine();

        if (!isCorrectValue(step)){
            out.println("ERROR");
        } else if (isCorrectStep(step)){
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();
    }

    public static boolean isCorrectValue(String step){

        if ((step.length() != 5) || (step.charAt(2) != '-')
                || step.charAt(0) < 'A' || step.charAt(0) > 'H'
                || step.charAt(3) < 'A' || step.charAt(3) > 'H'
                || step.charAt(1) < '1' || step.charAt(1) > '8'
                || step.charAt(4) < '1' || step.charAt(4) > '8'){
            return false;
        }

        return true;
    }

    public static boolean isCorrectStep(String step) {

        int vStep = step.charAt(1) - step.charAt(4);

        int hStep = step.charAt(0) - step.charAt(3);

        if ((vStep == -2 && hStep == -1)
                || (vStep == -2 && hStep == 1)

                || (vStep == 2 && hStep == -1)
                || (vStep == 2 && hStep == 1)

                || (vStep == -1 && hStep == 2)
                || (vStep == -1 && hStep == -2)

                || (vStep == 1 && hStep == 2)
                || (vStep == 1 && hStep == -2)){

            return true;
        }

        return false;
    }
}
