package ru.itis;

public class Main {

    public static void main(String[] args) {
        MyScanner scanner = new MyScanner("input.txt");
        int input = scanner.nextInt();
        while (input != -1) {
            System.out.println(input);
            input = scanner.nextInt();
        }
    }
}
