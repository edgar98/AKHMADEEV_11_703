package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        boolean f = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int proiz = 1, max = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] > a[max]) {
                max = i + 1;
                proiz = 1;
            } else if (a[i + 1] != 0) {
                proiz *= a[i + 1];
                f = true;
            }
        }
        if (max == a.length - 1 | !f) {
            System.out.printf("После максимального элемента нет ненулевых элеметов");
        } else {
            System.out.printf("Произведение элементов после максимального = %d", proiz);
        }
    }
}
