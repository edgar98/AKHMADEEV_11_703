package ru.itis;

import java.util.Scanner;

public class Matrix {
    private int a[][], n;

    public void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void obnull() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((i + 1) + (j + 1) < n + 1) {
                    a[i][j] = 0;
                }
                if ((i + 1) + (j + 1) > n + 1) {
                    a[j][i] = 0;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
