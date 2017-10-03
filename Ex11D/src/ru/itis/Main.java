package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = sc.nextInt();
        float sin = 1, cos = 1;
        double v = 1;
        for (int i = 1; i <= n; i++) {
            sin *= Math.sin(i);
            cos *= Math.cos(i);
            v *= (double)sin/cos;
        }
        System.out.println("Результат v = " + v);
    }
}  //похоже, что все в порядке
