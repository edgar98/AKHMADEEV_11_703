package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = 1, t = 0;
        int [] a = new int[n], u = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                l++;
            } else {
                u[t++] = l;
                l = 1;
            }
        }
        u[t] = l;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(u));
    }
}
