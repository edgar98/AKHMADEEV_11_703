package ru.itis;

class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
	    matrix.enter();

        System.out.println("Матрица является магической: " + matrix.dz5());
        System.out.println();

		matrix.dz1();
	    matrix.print();

		matrix.dz2();
	    matrix.print();

	    matrix.dz3();
	    matrix.print();

        matrix.dz4();
        matrix.print();
    }
}
