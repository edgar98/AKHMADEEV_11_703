package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 1;
        double x = sc.nextDouble(), a = sc.nextDouble(), tk = 1 / a,
                t = tk * Math.log(tk * x), eps = sc.nextDouble(), summ = 0;
        while (tk >= eps) {
            summ += t;
            tk *= 1 / a;
            t = tk * Math.log(tk * x);
        }
        System.out.println("Summ = " + summ);
    }
}
