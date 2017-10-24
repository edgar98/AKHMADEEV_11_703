//Задание 10 пункт Г

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вводим x,n - элемнты формулы
        System.out.print("Введите x = ");
        int x = sc.nextInt();
        System.out.print("Введите n = ");
        int n = sc.nextInt();
        //задаём общей сумме значение 1-го члена
        double s4 = x, x1 = x, x2 = 1.0;
        //вводим цикл по k со второго члена до 2n-члена
        for (int k = 2; k <= 2 * n; k++) {
            //проверяем чётность текущего члена
            if (k % 2 == 0) {
                x2 *= x * x * (1.0 / k);
                s4 += x2;
            } else {
                x1 *= x * x * (1.0 / k);
                s4 += x1;//те же замечания
            }
        }
        System.out.println("Результат S4 = " + s4);
    }
}
