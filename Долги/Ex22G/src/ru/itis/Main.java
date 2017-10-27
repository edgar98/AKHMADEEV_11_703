// Задание 22 Ж (массивы)

package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), p = 0, rand = 100;
        Random r = new Random();
        int [] a = new int[n];

        // Заполнение массива рандомом (-rand; rand)
        for (int i = 0; i < n; i++) {
            if (r.nextBoolean()) {
                a[i] = -1 * r.nextInt(rand);
            } else {
                a[i] = r.nextInt(rand);
            }
            System.out.println(a[i]);
        }

        // Создаём массив для определения простых чисел
        // при помощи алгоритма решета Эратосфена
        int [] prost = new int[rand];
        // Заполняем массив единицами
        for (int i = 2; i < prost.length; i++) {
            prost[i] = 1;
        }
        for(int i = 2; i * i < prost.length; i++) {
            // если k - простое (не вычеркнуто)
            if(prost[i] == 1) {
                // то вычеркнем кратные k
                for(int k = i * i; k < prost.length; k += i) {
                    prost[k] = 0;
                }
            }
        }
        // В итоге имеем, что на позициях простых чисел стоят 1,
        // а на остальных 0

        // Проверка элементов массива
        for (int i = 0; i < n; i++) {
            if (prost[Math.abs(a[i])] == 1) {
                p++;
            }
        }
        System.out.println("p = " + p);
    }
}