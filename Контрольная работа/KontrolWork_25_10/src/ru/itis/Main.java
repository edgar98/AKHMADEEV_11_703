// Билет 14, задание 1

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int i = 1;
	    double summ = 0.0, t = 1.0 / 6, eps = sc.nextDouble();
	    while (Math.abs(t) > eps) {
	        summ += t;
	        t *= i * (1.0 / ++i) * (-1.0);
        }
        System.out.println("Summ = " + summ);
    }
}
