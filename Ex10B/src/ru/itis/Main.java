//Задание 10 пункт Б

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вводим x,n - элемнты формулы; fakt - переменная факториала
        System.out.print("Введите x = ");
        int x = sc.nextInt();
        System.out.print("Введите n = ");
        int n = sc.nextInt(), fakt = 1 ;
        //s2 - общая сумма; chisl - чистлитель члена; znam - знаменатель члена
        double s2 = x, chisl = x, znam = 1;
        //вводим цикл по k от 1 до n (считаем со 2-го члена)
        for(int k = 1; k <= n; k++){
            //увеличиваем факториал (2k)!
            fakt *= 2 * k * (2 * k - 1);
            //задаём числитель текущего члена
            chisl *= (-1.0)*x*x*x*x;
            //задаём знаменатель текущего члена
            znam = fakt*(4*k+1);
            //прибавляем текущий член к сумме
            s2 += chisl/znam;
        }
        System.out.println("Результат S2 = " + s2);
    }
}
