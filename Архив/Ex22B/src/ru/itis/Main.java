// Задание 22 Б (массивы)

package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = 0;
        Random r = new Random();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            if (r.nextBoolean()) {
                a[i] = -1 * r.nextInt(100);
            } else {
                a[i] = r.nextInt(100);
            }
        }
        for (int i = 0; i < n -1; i++) {
            if (a[i] * a[i + 1] < 0) {
                q++;
            }
        }
        System.out.println("q = " + q);
    }
}