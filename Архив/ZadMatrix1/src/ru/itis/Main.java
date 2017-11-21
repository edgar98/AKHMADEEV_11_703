package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int n, m, matrix[][];

    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void readMatrix() {
        n = m = scanner.nextInt();
        matrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[] findMinsInColummns(int matrix[][]) {
        int mins[] = new int[matrix.length];
        for (int i = 0; i < m; i++) {
            mins[i] = matrix[0][i];
            for (int j = 1; j < n; j++) {
                if (matrix[j][i] < mins[i]) mins[i] = matrix[j][i];
            }
        }
        return mins;
    }

    public static void main(String[] args) {
	    readMatrix();
        showMatrix(matrix);
        System.out.println(Arrays.toString(findMinsInColummns(matrix)));
    }
}
