// Задание 10 пункт А

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // вводим x,n - элементы формулы
        System.out.print("Введите x = ");
        int x = sc.nextInt();
        System.out.print("Введите n = ");
        int n = sc.nextInt();
        // s1 - общая сумма; x0 - член последовательности
        double s1 = x, x0 = x;
        // вводим цикл по k от 1 до n (считаем со 2-го члена)
        for(int k = 1; k <= n; k++){
            // вычисляем текущий член последовательности
            x0 *= (-1.0)*x*x*(2.0*(k-1.0)+1.0)*(1.0/k)*(1.0/(2.0*k + 1.0));
            // добавляем его к сумме
            s1 += x0;
        }
        System.out.println("Результат S1 = " + s1);
    }
}
