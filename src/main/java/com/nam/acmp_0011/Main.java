package com.nam.acmp_0011;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int n = in.nextInt();

        BigDecimal sum;

        sum = MyFunc(k, n);

        out.println(sum.toString());

        out.flush();
    }

    public static BigDecimal MyFunc(int k, int n){


        List<BigDecimal> steps = new ArrayList<>();


        //steps.set(0, new BigDecimal(1));

        for (int i = 0; i < n + 1; i++){
            steps.add(new BigDecimal(0));
            //steps.set(i, new BigDecimal(0));
        }
        steps.set(0, new BigDecimal(1));
        //steps[0] = BigDecimal(1);
        /*if (n == 0){
            return 1;
        }*/

        int count = 0;

        for (int i = 1; i < n + 1; ++i) {

           // int temp = 0;
            for (int j = i - 1; j >= (i - k) && j >= 0; --j) {

                //System.out.println("MyFunc k = " + k + " n = " + (n - i));

                //count += MyFunc(k, n - i);
                //steps[i] += steps[i-j];

               // int t = (i - k - 1) < 0)?0:steps[i - k - 1];
                //steps[i] += steps[j];

                steps.set(i, steps.get(i).add(steps.get(j)));
            }

        }

        return steps.get(n);
    }
}
