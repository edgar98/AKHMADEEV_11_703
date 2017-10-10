package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = 0; //всегда целое. Это не очень хорошо, это же ограниичивает задачу.
        double eps = sc.nextDouble(), s = 0, t = 1;
        while (Math.abs(t) > eps) {
            s += t;
            n++;
            t *= 1.0*x/n;
        }
        System.out.println(n + " " + s);
    }
}
