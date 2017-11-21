//1.4 к,к
//Вычисление кубического корня от х1, х2, х3

//x1 = -1.2; x2 = +0.1; x3 = +2.1; n = 30

package ru.itis;

import java.util.Scanner;

public class Main {

    public static int kol_res = 3; // количество иксов и результатов
    public static double x[] = new double[kol_res], y, y_res[] = new double[kol_res], u, u0 = 1.0;
    public static int n;

    public static void main(String[] args) {
        init(); //ввод входных данных
        for (int i = 0; i < kol_res; i++) {
            y = f(x[i]);
            for (int j = 1; j <= n; j++) {
                u = (2.0 / 3) * u0 + y / (3.0 * u0 * u0);
                u0 = u; //реализация рекуренты
            }
            y_res[i] = u; //присваивание результата вычисления элементу массива ответов

        }
        for (int i = 0; i < kol_res; i++) {
            System.out.println("Результат вычисления y" + (i + 1) + " = " + y_res[i]); // вывод результатов
        }
    }

    public static double f(double x) { // функция от x(i)
        if (x < 0.5) return 1.0 - 0.1 * Math.cos(1 + x);
        else return 1.0 + 0.1 * Math.cos(1 + x);
    }

    public static void init() { //метод ввода
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < kol_res; i++) {
            System.out.print("Введите x" + (i + 1) + ": ");
            x[i] = sc.nextDouble();
        }
        System.out.print("Введите n: ");
        n = sc.nextInt();
    }
}
