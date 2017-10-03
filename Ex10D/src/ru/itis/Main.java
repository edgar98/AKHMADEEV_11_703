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
        //fakt1 - нечётный факториал; fakt2 - чётный факториал
        long fakt1 = 1, fakt2 = 1;
        //chisl - числитель члена
        long chisl = x;
        //задаём общей сумме значение 1-го члена
        double s4 = x;
        //вводим цикл по k со второго члена до 2n-члена
        for (int k = 2; k <= 2*n; k++) {
            //задаём числитель текущего члена
            chisl *= x;
            //проверяем чётность текущего члена
            if (k % 2 == 0) {
                /*
                если член чётный, увеличиваем значение чётного факториала
                и приваляем этот член к сумме
                 */
                fakt2 *= k;
                s4 += (double)chisl/fakt2;
            } else {
                /*
                если член нечётный, увеличиваем значение нечётного факториала
                и прибавляем этот член к сумме
                 */
                fakt1 *= k;
                s4 += (double)chisl/fakt1;
            }
        }
        System.out.println("Результат S4 = " + s4);
    }
}