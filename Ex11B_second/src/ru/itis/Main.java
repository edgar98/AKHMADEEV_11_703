//Задание 11 Б (второй вариант решения)

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = sc.nextInt();
        /*
        Выражение cos(x)/sin(x) = ctg(x), поэтому заменяем его
         */
        double ctg = 1, t = 0;
        for (int i = 1; i <= n; i++) {
            ctg *= 1/Math.tan(i);
            t += ctg;
        }
        System.out.println("Результат t = " + t);
    }
}
