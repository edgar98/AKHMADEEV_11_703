package ru.itis;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt(), a[] = new int[n], backup = 0;
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(100);
            System.out.print(a[i] + " ");
        }
        int [] y = new int[n];
        System.out.println();
//        for (int i = 0, j = n-1; i < n; i++, j--) {
//            y[i] = a[j];
//            System.out.print(a[i] + " ");
//        }
        for (int i = n - 1; i >= 0; i--) {
            y[i] = a[n - 1 - i];
            System.out.print(a[i] + " ");
        }
//        for (int x: y) {
//            System.out.print(x + " ");
//        }

    }
}
