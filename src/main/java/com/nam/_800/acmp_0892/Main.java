package com.nam._800.acmp_0892;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String[] seasons = {"Error", "Winter", "Spring", "Summer", "Autumn"};

        int n = in.nextInt();

        switch (n){
            case 12:
            case 1:
            case 2:{
                out.println(seasons[1]);
                break;
            }
            case 3:
            case 4:
            case 5:{
                out.println(seasons[2]);
                break;
            }
            case 6:
            case 7:
            case 8:{
                out.println(seasons[3]);
                break;
            }
            case 9:
            case 10:
            case 11: {
                out.println(seasons[4]);
                break;
            }
            default:
                out.println(seasons[0]);
                break;
        }

        out.flush();
    }
}
