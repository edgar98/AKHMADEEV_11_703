// сортировка массива методом поиска локальных экстремумов

package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        down1(a); // по убыванию

        down2(a); // по невозрастанию

        up1(a); // по возрастанию

        up2(a); // по неубыванию

    }

    public static void down1(int[] a) {
        int max, maxi, b;
        for (int i = 0; i < a.length; i++) {
            max = a[i];
            maxi = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                    maxi = j;
                }
            }
            b = a[i];
            a[i] = a[maxi];
            a[maxi] = b;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void down2(int[] a) {
        int max, maxi, b;
        for (int i = 0; i < a.length; i++) {
            max = a[i];
            maxi = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] >= max) {
                    max = a[j];
                    maxi = j;
                }
            }
            b = a[i];
            a[i] = a[maxi];
            a[maxi] = b;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void up1(int[] a) {
        int min, mini, b;
        for (int i = 0; i < a.length; i++) {
            min = a[i];
            mini = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    mini = j;
                }
            }
            b = a[i];
            a[i] = a[mini];
            a[mini] = b;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void up2(int[] a) {
        int min, mini, b;
        for (int i = 0; i < a.length; i++) {
            min = a[i];
            mini = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] <= min) {
                    min = a[j];
                    mini = j;
                }
            }
            b = a[i];
            a[i] = a[mini];
            a[mini] = b;
        }
        System.out.println(Arrays.toString(a));
    }
}
