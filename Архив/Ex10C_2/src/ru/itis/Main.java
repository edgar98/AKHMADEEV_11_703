// Задание 10 пункт В

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // вводим x,n - элемнты формулы
        System.out.print("Введите x = ");
        float x = sc.nextFloat();
        System.out.print("Введите n = ");
        int n = sc.nextInt();
        // s3 - общая сумма; x0 - предыдущий член последовательности
        double s3 = x * x / 2, x0 = x * x / 2;
        // вводим цикл по k от 2 до n (считаем со 2-го члена)
        for (int k = 2; k <= n; k++) {
            // задаём текущий член
            x0 *= x * x * (2.0 * k - 1.0) * 1 / (2 * k);
            // прибавляем текущий член к сумме
            s3 += x0;
            //те же замечания
        }
        System.out.println("Результат S3 = " + s3);
    }
}
