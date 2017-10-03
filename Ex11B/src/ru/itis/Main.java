//Задание 11 Б (первый вариант решения)

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = sc.nextInt();
        float sin = 1, cos = 1, t = 0;
        for (int i = 1; i <= n; i++) {
            sin *= Math.sin(i);
            cos *= Math.cos(i);
            t = cos/sin; //  не вижу суммы
        }
        System.out.println("Результат t = " + t);
    }
}
