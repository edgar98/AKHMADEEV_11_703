package ru.itis;

import java.util.Scanner;

public class Ex13A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                k++;
            }
        }
        System.out.println(k);
    }
}
