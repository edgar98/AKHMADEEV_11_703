package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t1[] = new int[n], t2[] = new int[n];
        for (int i = 0; i < n; i++) {
            t1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t2[i] = sc.nextInt();
        }
        boolean f = true;
        for (int i = 0; i < n; i++) {
            if (t1[i] > t2[i]) f = false;
        }
        if (f) System.out.println("T1 является подмножеством Т2");
        else System.out.println("T1 не является подмножеством Т2");
    }
}
