// Задание 10 пункт Б

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // вводим x,n - элемнты формулы
        System.out.print("Введите x = ");
        int x = sc.nextInt();
        System.out.print("Введите n = ");
        int n = sc.nextInt();
        // s2 - общая сумма
        double s2 = x, x0 = x;
        // вводим цикл по k от 1 до n (считаем со 2-го члена)
        for(int k = 1; k <= n; k++){
            // вычисляем текущий член
            x0 *= (-1.0) * x * x * x * x * (4.0 * (k - 1.0) + 1.0) * 1 / (4.0 * k + 1.0) * 1 / (2 * k * (2 * k - 1));
            // прибавляем текущий член к сумме
            s2 += x0;
        }
        System.out.println("Результат S2 = " + s2);
    }
}
