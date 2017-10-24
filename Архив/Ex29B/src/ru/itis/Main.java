package ru.itis;//+

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps = sc.nextDouble(), x0 = 0, x = Math.cos(x0);
        int k = 1;
        while (Math.abs(x0 -x) > eps) {
            x0 = x;
            x = Math.cos(x0);
            k++;
        }
        System.out.println("n = " + k);
    }
}
