// Задание 5 Б

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps = sc.nextDouble();
        int n = 2;
        double sn = 1, flag =-1;
        while ((sn - Math.PI / 4) * (sn - Math.PI / 4) >= eps*eps) {

            sn += flag/(2 * n - 1);
            flag *= -1;
            n++;
        }
        System.out.println("Sn = " + sn);
        System.out.println("n = " + (n-1));
    }
}
