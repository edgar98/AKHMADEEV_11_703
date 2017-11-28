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

    public void gauss() {
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    a[i][k] = (a[i][k] * a[j][j]) - (a[j][k] * a[i][j]);
                    if (j != 0) a[i][k] /= a[j][j];
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
