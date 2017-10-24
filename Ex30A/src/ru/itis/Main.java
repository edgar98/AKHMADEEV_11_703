// Задание 30 А

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // f  = (x * x * x * x * x - x - 0.002)
        // f' = (5 * x * x * x * x - 1)
        // f''= (20 * x * x * x)

        double eps = 0.0001, a = sc.nextDouble(), b = sc.nextDouble(),x0 = 0;

        if ( ((a * a * a * a * a - a - 0.002) * (20 * a * a * a)) > 0 ) {
            x0 = a;
        } else {
            x0 = b;
        }
        double x = x0 - (x0 * x0 * x0 * x0 * x0 - x0 - 0.002) / (5 * x0 * x0 * x0 * x0 - 1);

        while (Math.abs(x - x0) > eps) {
            x0 = x;
            x = x = x0 - (x0 * x0 * x0 * x0 * x0 - x0 - 0.002) / (5 * x0 * x0 * x0 * x0 - 1);
        }
        System.out.println("x =" + x);
    }

}
