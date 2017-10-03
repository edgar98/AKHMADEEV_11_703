//Задание 10 пункт В

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вводим x,n - элемнты формулы
        System.out.print("Введите x = ");
        float x = sc.nextFloat();
        System.out.print("Введите n = ");
        int n = sc.nextInt();
        //s3 - общая сумма; chisl - чистлитель члена; znam - знаменатель члена
        double s3 = x*x/2, chisl = x*x, znam = 2;
        //вводим цикл по k от 2 до n (считаем со 2-го члена)
        for(int k = 2; k <= n; k++){
            //задаём числитель текущего члена
            chisl *= x*x*(2 * k - 1);
            //задаём знаменатель текущего члена
            znam *= 2 * k;
            //прибавляем текущий член к сумме
            s3 += chisl/znam;
        }
        System.out.println("Результат S3 = " + s3);
    }
}
