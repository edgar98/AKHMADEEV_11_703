package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matrix[][], mass[], m, n, p;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите Р: ");
        p = sc.nextInt();
        mass = new int[p];
        for (int i = 0; i < p; i++) {
            mass[i] = sc.nextInt();
        }

        Result result[] = new Result[p];

        System.out.print("Кол-во строк М: ");
        m = sc.nextInt();
        System.out.print("Кол-во столбцов N: ");
        n = sc.nextInt();
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        byte zapad = 0;
        for (int a = 0; a < p; a++) {
            int x = mass[a], x0 = x % 10;
            if (zapad == 3) break;
            for (int i = 0; i < m; i++) {
                if (zapad == 3) break;
                zapad = 0;
                for (int j = 0; j < n; j++) {
                    if ((matrix[i][j] == x0) & (x != 0)) {
                        zapad++;
                        x /= 10;
                        x0 = x % 10;
                    }
                }
            }
        }
        System.out.println(zapad == 3);

    }
}
