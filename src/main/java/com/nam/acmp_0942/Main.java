package com.nam.acmp_0942;

import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        List<Integer> tasks = new ArrayList<>();

        for (int i = 0; i < n; i++){
            tasks.add(in.nextInt());
        }

        out.println(selectWinner(calcFifth(tasks), calcThird(tasks), calcFirst(tasks)));

        out.flush();
    }

    public static int calcFifth(List<Integer> tasks){
        int fine = 0;

        int size = tasks.size();

        for (Integer i : tasks){

            fine += i * size--;
        }

        return fine;
    }

    public static int calcThird(List<Integer> tasks){
        int fine = 0;

        int size = tasks.size();

        for (int i = tasks.size() - 1; i >= 0; i--){
            fine += tasks.get(i) * size--;
        }

        return fine;
    }

    public static int calcFirst(List<Integer> tasks){

        tasks.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        return calcFifth(tasks);
    }

    public static int selectWinner(int fifth, int third, int first){
        if (fifth < third){
            if (fifth < first){
                return 5;
            } else {
                return 1;
            }
        } else if (third < first){
            return 3;
        } else {
            return 1;
        }
    }
}
