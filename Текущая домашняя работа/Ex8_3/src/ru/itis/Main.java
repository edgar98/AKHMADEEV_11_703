package ru.itis;

import java.util.Arrays;
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
        int [] tut = new int[n], tnt = new int[n], tnet = new int[n];
        for (int i = 0; i < n; i++) {
            if (t1[i] == 1 | t2[i] == 1) tut[i] = 1;
            if (t1[i] == 1 & t2[i] == 1) tnt[i] = 1;
            if (t1[i] == 1 & t2[i] != 1) tnet[i] = 1;
        }
        System.out.println("Объединение =" + Arrays.toString(tut));
        System.out.println("Пересечение =" + Arrays.toString(tnt));
        System.out.println("Вычитание   =" + Arrays.toString(tnet));
    }
}
