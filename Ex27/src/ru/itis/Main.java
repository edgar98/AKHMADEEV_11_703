package ru.itis;//+

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), eps = sc.nextDouble(), as = 1, bs = 1 - x, an = as * (1.0 + bs), bn = bs * bs;
        for (int i = 1; bn > eps; i++) {
            an = as * (1.0 + bs);
            bn = bs * bs;
            as = an;
            bs = bn;
        }
        System.out.println("an = " + an);
    }
}
