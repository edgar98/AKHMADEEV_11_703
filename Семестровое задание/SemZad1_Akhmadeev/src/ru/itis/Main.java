package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
    Комментарий к выполнению.
        Я не понял условие задачи, но попытался сделать её.
        Дополнительные методы были введены для удобства при написании программы,
        при необходимости могу убрать.
     */

    public static Scanner sc = new Scanner(System.in); // объявление переменных вне метода main() для доп. методов
    public static double z0, z1, h, z; // z0, z1, n, m, h - входные данные
    public static int n, m, fi[];      // z - переменная z(i), fi[] - числа Фи от 1 до m

    public static void main(String[] args) {

        init(); // метод инициализации переменных, ввод данных
        for (int i = 1; i <= n; i++) {
            /*
                Во внешнем цикле образуется z(i) = f( z(i-1), z(i-2) ), функция описана в методе f()
             */
            if (i > 1) z = f(z1,z0); // z(1) считать не надо, оно подаётся на вход, поэтому пропускаем его

            for (int j = 1; j <= m; j++) {
                /*
                   Во внутреннем цикле проверяем принадлежность z'(i) полуинтервалу
                   и, если входит, инкрементируем соответствующую фи(i)
                 */
                if ((z < 0) | (z > (m * h))) break; // в "указаниях" сказано, что z(i) (не штрих!!!)
                                                    // должен входить в полный отрезок, поэтому я
                                                    // добавил эту строку, но не уверен в её необходимости
                if ((Math.abs(z - 2.5) >= ((j-1) * h)) & (Math.abs(z - 2.5) < (j * h))) {
                    fi[j]++;
                }
            }

            if (i > 1) { // см. выше, пропуск z(1)
                z0 = z1;
                z1 = z;
            }

        }

        System.out.println("Множество чисел Фи: " + Arrays.toString(fi)); // вывод чисел фи

    }

    public static double f(double a, double x) {
        /*
            Функция для нахождения очередного z
         */
        return (1 - 5.7 * Math.cos(a - x))/(2.6 + Math.cos(a + x) * Math.cos(a + x));
    }

    public static void  init() {
        /*
            Метод, инициализирующий все переменные, необходимые для работы программы
         */
        System.out.print("Введите z0: ");
        z0 = sc.nextDouble();
        System.out.print("Введите z1: ");
        z1 = z = sc.nextDouble();
        System.out.print("Введите n: ");
        n = sc.nextInt();
        System.out.print("Введите m: ");
        m = sc.nextInt();
        System.out.print("Введите h: ");
        h = sc.nextDouble();
        fi = new int[m];
    }
}
