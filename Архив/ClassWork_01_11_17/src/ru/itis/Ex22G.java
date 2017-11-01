package ru.itis;

import java.util.Scanner;

public class Ex22G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f = false;
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1 && !f; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    f = true;
                }
            }
        }
        System.out.printf("В массиве есть одинаковые элементы = " + f);
    }
}
