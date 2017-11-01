// Задание 8 пункт 1 (массивы)

package ru.itis;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt(), a[] = new int[n], card = 0;
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(2);
        }
        for (int x : a) {
            if (x == 1) card++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("card(T) = " + card);
    }
}
