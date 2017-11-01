//Задание 14 А

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps = sc.nextDouble(), x = sc.nextDouble(), summ = 0, tk = 1, t = -1 * tk * Math.sin(tk * x) * Math.sin(tk * x), f = -1;
        int k = 1;
        while (tk >= eps) {
            summ += t;
            k++;
            f = -f;
            tk *= 1 / k;
            t = f * tk * Math.sin(tk * x) * Math.sin(tk * x);
        }
        System.out.println("Summ = " + summ);
    }
}
