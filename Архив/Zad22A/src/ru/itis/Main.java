package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        int [] a = new int[n];
        int summ1 = 0, summ2 = 0, f = 0;
        for (int i = 0; i < n; i++) {
            if (r.nextBoolean() == true) {
                a[i] = -1 * r.nextInt(100);
            } else {
                a[i] = r.nextInt(100);
            }
        }
        for (int x: a) {
            if (x >= 0) {
                summ1 += x;
            }   else {
                summ2 += x;
            }
        }
        System.out.println(summ1 + " " + summ2);
    }
}
