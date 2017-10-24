// Задание 32 Б

package ru.itis;

public class Main {

    public static void main(String[] args) {
        double eps = 0.0001, x0 = 0.0, x = -1 * Math.log(x0 + 3.0);
        while (Math.abs(x - x0) > eps) {
            x0 = x;
            x = -1 * Math.log(x0 + 3.0);
        }
        System.out.println("x = " + x);
    }
}
