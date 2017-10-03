package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите n = ");
        // вводим значение n
        int n = sc.nextInt();

        System.out.print("Введите x = ");
        // вводим значение x, xk - переменная x^k для циклов сумм
        int x = sc.nextInt(), xk = 1;

        // u - переменная результата
        double u = 1, summ = 0;

        // вводим цикл произведения по m от 1 до n
        for (int m = 1; m <= n; m++) {

            // перед каждым выполнением цикла суммы возращаем переменные в исходное состояние
            xk = 1;
            summ = 0;

            for (int k = 1; k <= m; k++) {
                xk *= x;
                summ += Math.cos(xk);
            }

            //домножаем произведение на очередную сумму
            u *= summ;
        }

        System.out.println("Результат u = " + u);
    }
}
