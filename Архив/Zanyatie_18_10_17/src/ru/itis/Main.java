package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, a[]; //объявляем массив а
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n]; // инициализиуем массив а
        Random r = new Random(); // рандом
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100); // присваиваем элементам массива а рандомные значения в пределах 100
        }
        for (int x : a) {
            System.out.println(x); // выводим массив а
            /*
                другой способ задания рандома:
                    a[i] = (int) Math.round(Math.random() * 100);
                Math.random() выдаёт значения от 0 до 1
             */
        }
    }
}
