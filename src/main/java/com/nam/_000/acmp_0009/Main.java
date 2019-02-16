package com.nam._000.acmp_0009;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int size = in.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++){
            numbers[i] = in.nextInt();
        }

        //System.out.println("N : " + size);
        //System.out.println("Numbers : " + Arrays.toString(numbers));

        int sumOfPositive = 0;
        int minIndex = 0;
        int maxIndex = 0;


        for (int i = 0; i < size; i++){
            if (numbers[i] > 0){
                sumOfPositive += numbers[i];
                //System.out.println("Positive : " + numbers[i]);
            }

            if (numbers[i] < numbers[minIndex]){
                minIndex = i;
            }

            if (numbers[i] > numbers[maxIndex]){
                maxIndex = i;
            }
        }

        //System.out.println("Min index " + minIndex);
        //System.out.println("Max index " + maxIndex);

        if (maxIndex < minIndex){
            int temp = maxIndex;
            maxIndex = minIndex;
            minIndex = temp;
        }

        int multiply = 1;

        for (int i = minIndex + 1; i <= maxIndex - 1; i++){
            multiply *= numbers[i];
        }


        out.print(sumOfPositive + " ");
        out.println(multiply);

        out.flush();
    }
}
