package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt(), x[] = new int[n], y[] = new int[n], z[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = r.nextInt(100);
        }
        System.out.println(x[0] + " " + y[0] + " " + z[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(x[i] + " ");
            if ((x[i] * x[i -1]) < 0) {
                y[i] = 1;
            } else {
                y[i] = 0;
            }
            System.out.print(y[i] + " ");
            if (x[i] < x[i -1]) {
                z[i] = 1;
            } else {
                z[i] = 0;
            }
            System.out.println(z[i]);
        }
    }
}
