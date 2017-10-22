package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long summ = 0, summ2 = 0;
        int a[]  = new int[n], b[] = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {

            b[i] = sc.nextInt();

        }

        for (int i = (n - 1); i >= 0; i--) {

            summ += a[i] * b[i];

        }

        System.out.println(summ);
    }
}
