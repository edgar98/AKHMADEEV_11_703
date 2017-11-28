package ru.itis;

import java.util.Scanner;

class Matrix {
    private int matrix[][], razmer;

    Matrix() {}

    Matrix(int razmer) {
        this.razmer = razmer;
        matrix = new int[razmer][razmer];
    }

    public void enter() { // ввод матрицы
        Scanner sc = new Scanner(System.in);
        if (razmer == 0) {
            System.out.print("Введите размер матрицы: ");
            razmer = sc.nextInt();
            matrix = new int[razmer][razmer];
        }
        for (int i = 0; i < razmer; i++) {
            for (int j = 0; j < razmer; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    public void print() { // печать матрицы
        for (int i = 0; i < razmer; i++) {
            for (int j = 0; j < razmer; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void bubbleSort(int[] arr) { // сортировка массива методом пузырька
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public void dz1() {

        // сортировка каждой строки матрицы методом пузырька

        for (int line = 0; line < razmer; line++) {
            bubbleSort(matrix[line]);
        }
    }

    public void dz2() {

        // обнулить элементы ниже главной диагонали

        for (int i = 1; i < razmer; i++) {
            for (int j = i - 1; j >= 0; j--) {
                matrix[i][j] = 0;
            }
        }
    }

    public void dz3() {

        // заполнить единицами элементы выше побочной диагонали

        for (int i = 0; i < razmer; i++) {
            for (int j = 0; j < razmer - i - 1; j++) {
                matrix[i][j] = 1;
            }
        }
    }

    public void dz4() {

        // транспонировать матрицу

        for (int i = 1; i < razmer; i++) {
            for (int j = 0; j < i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }

    public boolean dz5() {
        int summ1 = 0, summ2 = 0, summ = 0;
        for (int i = 0; i < razmer; i++) {
            summ += matrix[i][i];
            summ1 += matrix[i][razmer - 1 - i];
        }
        if (summ1 != summ) return false;
        summ1 = 0;
        for (int i = 0; i < razmer; i++) {
            for (int j = 0; (j < razmer) & (summ1 < summ) & (summ2 < summ); j++) {
                summ1 += matrix[i][j];
                summ2 += matrix[j][i];
            }
            if ((summ1 != summ) | (summ2 != summ)) return false;
            summ1 = summ2 = 0;
        }
        return true;
    }
}