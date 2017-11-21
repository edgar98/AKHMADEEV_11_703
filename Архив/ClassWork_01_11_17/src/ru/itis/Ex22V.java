package ru.itis;

import java.util.Scanner;

public class Ex22V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        boolean vverh = true, vniz = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] >= a[i + 1]) {
                vverh = false;
            }
            if (a[i] <= a[i + 1]) {
                vniz = false;
            }
        }
        if (vniz) System.out.println("Массив отсортирован по убыванию");   
        //else
        if (vverh) System.out.println("Массив отсортирован по возрастанию");
        //else
        if (!vniz & !vverh) System.out.println("Массив отсортирован никак");
    }
}
