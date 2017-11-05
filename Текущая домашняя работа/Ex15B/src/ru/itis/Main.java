package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n], u[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] <= a[i + 1]) l++;
            else {
                u[l - 1]++;
                l = 1;
            }
        }
        u[l - 1]++;
        System.out.println(Arrays.toString(u));
    }
}
