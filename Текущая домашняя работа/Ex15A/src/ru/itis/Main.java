package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s = n, t = 0, dlina = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] <= a[i + 1]) {
                dlina++;
            } else {
                if (dlina > t) t = dlina;
                if (dlina < s) s = dlina;
                dlina = 1;
            }
        }
        if (dlina > t) t = dlina;
        if (dlina < s) s = dlina;
        System.out.println("s = " + s + " t = " + t);
    }
}
