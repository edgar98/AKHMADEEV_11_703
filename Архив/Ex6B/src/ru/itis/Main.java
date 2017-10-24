package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps = sc.nextDouble(), sn = 0, x = 1;
        int n = 0, flag = -1;
        while (Math.abs(x) > eps) {
            sn += x;
            n++;
            x = flag/((2.0 * n + 1.0)*(2.0 * n + 1.0));
            flag = -flag;
        }
        System.out.println(n + " " + sn);
    }
}
