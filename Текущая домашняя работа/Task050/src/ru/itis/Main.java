package ru.itis;

public class Main {

    public static void main(String[] args) {
        RationalFraction drob1 = new RationalFraction(-1,2);
        RationalFraction drob2 = new RationalFraction(-6,4);

        System.out.println(drob1.value());
        System.out.println(drob2.value());
        drob1.reduce();
        drob2.reduce();
        System.out.println(drob1);
        System.out.println(drob2);
        System.out.println(drob1.equals(drob2));
        System.out.println(drob2.numberPart());
    }
}
