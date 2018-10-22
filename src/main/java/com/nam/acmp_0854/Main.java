package com.nam.acmp_0854;

import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String[] modes = new String[] {"freeze", "heat", "auto", "fan"};

        int tRoom = in.nextInt();
        int tCond = in.nextInt();

        String curMode = in.next();

        if (curMode.equals(modes[0])) {   //freeze
            out.println(min(tRoom, tCond));
        } else if(curMode.equals(modes[1])){    //heat
            out.println(max(tRoom, tCond));
        } else if (curMode.equals(modes[2])){   //auto
            out.println(tCond);
        } else if (curMode.equals(modes[3])){   //fan
            out.println(tRoom);
        }

        out.flush();
    }
}
