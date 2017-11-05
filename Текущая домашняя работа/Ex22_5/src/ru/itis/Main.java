package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(6);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean f = true;
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((a[j] == a[i]) & (j != i)) {
                    f = false;
                    break;
                }
            }
            if (f) res++;
            f = true;
        }
        System.out.println("Число уникальных компонент = " + res);
    }
}
