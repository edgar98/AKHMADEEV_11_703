package ru.itis;//+

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x[] = new int[n], y[] = new int[n], z[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = i;
        }
        for (int i = 0; i < n - 1; i++) {
            y[i] = x[i + 1];
        }
        y[n - 1] = x[0];
        for (int i = n - 1; i > 0; i--) {
            z[i] = x[i - 1];
        }
        z[0] = x[n -1];


        for (int s : x) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (int s : y) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (int s : z) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
