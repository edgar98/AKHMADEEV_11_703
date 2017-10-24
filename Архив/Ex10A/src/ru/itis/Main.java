//Задание 10 пункт А

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вводим x,n - элементы формулы; fakt - переменная факториала
        System.out.print("Введите x = ");
        int x = sc.nextInt();
        System.out.print("Введите n = ");
        int n = sc.nextInt(), fakt = 1 ;
        //s1 - общая сумма; sx0 - предыдущий член последовательности
        double s1 = x, chisl = x, znam = 1;
        //вводим цикл по k от 1 до n (считаем со 2-го члена)
        for(int k = 1; k <= n; k++){
            //увеличиваем факториал k! по формуле
            fakt *= k;  // быстро растет
            //задаём числитель текущего члена
            chisl *= (-1.0)*x*x;   //тоже, или убывает
            //задаём знаменатель текущего члена
            znam = fakt*(2*k+1);
            //прибавляем текущий член к сумме
            s1 += chisl/znam;  //  я говорила, что нужна формула для подсчета всего слагаемого в целом
        }
        System.out.println("Результат S1 = " + s1);
    }
}
