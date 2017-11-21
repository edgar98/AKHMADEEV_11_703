package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int min = 0, max = 0, summ = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
            if (a[i] < a[min]) {
                min = i;
            }
        }
        if (max > min) {
            for (int i = min + 1; i < max; i++) {
                summ += a[i];
            }
        } else {
            for (int i = max + 1; i < min; i++) {
                summ += a[i];
            }
        }
        System.out.printf("Сумма элементов между макс и мин массива равна %-3d\nmax = %-3d\nmin = %-3d", summ, a[max], a[min]);
    }
}
