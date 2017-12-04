package ru.itis;

public class Main {

    public static void main(String[] args) {

        Vector2D vector0 = new Vector2D();
        Vector2D vector1 = new Vector2D(2.0, 4.0);
        Vector2D vector2 = new Vector2D(3.0, 5.0);

        Vector2D summ = vector1.add(vector2);
        System.out.println("Сумма вектора1 и вектора2 = " + summ);
        System.out.println();

        vector0.add2(vector1);
        System.out.println("вектор0 + вектор1 = " + vector0);
        System.out.println();

        Vector2D sub = vector1.sub(vector2);
        System.out.println("sub = вектор1 - вектор2 = " + sub);
        System.out.println();

        vector0.sub2(vector1);
        System.out.println("Вектор0 - вектор1 = " + vector0);
        System.out.println();

        Vector2D mult = vector1.mult(2.0);
        System.out.println("mult = вектор1 * 2,0 = " + mult);
        System.out.println();

        vector2.mult2(2.0);
        System.out.println("Вектор2 * 2,0 = " + vector2);
        System.out.println();

        System.out.println("Длина вектора1 = " + vector1.length());
        System.out.println();

        System.out.println("Скалярное произведение вектора1 на вектор2 = " + vector1.scalarProduct(vector2));
        System.out.println();

        System.out.println("cos угла между вектором1 и вектором2 = " + vector1.cos(vector2));
        System.out.println();

        System.out.println("Вектор1 = " + vector1);
        System.out.println();

        System.out.println("Вектор1 равен вектору2: " + vector1.equals(vector2));
        System.out.println();
    }
}
