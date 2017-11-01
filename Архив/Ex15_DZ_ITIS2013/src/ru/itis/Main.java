package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), res = 0, cifr = 1;
        while (x != 0) {
            if ((x % 10) % 2 == 1) {
                res += (x % 10) * cifr;
                cifr *= 10;
            }
            x = x / 10;
        }
        System.out.println("Result = " + res);
    }
}
