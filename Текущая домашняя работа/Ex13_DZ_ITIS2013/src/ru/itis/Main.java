package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),res = 0, t = -1;
        while (x != 0) {
            t = -t;
            res += t * (x % 10);
            x = x/10;
        }
        System.out.println("Result = " + res);
    }
}
