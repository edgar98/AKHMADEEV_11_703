package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0], kol = 1;
        for (int x : a) {
            if (x < min) {
                min = x;
                kol = 1;
            } else if (x == min) {
                kol++;
            }
        }
        System.out.printf("Минимальный элемент массива равен %-3d \nКол-во минимальных элементов равно %-3d", min, kol);
    }
}
