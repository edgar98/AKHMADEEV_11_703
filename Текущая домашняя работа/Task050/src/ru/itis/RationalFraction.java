package ru.itis;

public class RationalFraction {
    private int a,b;

    RationalFraction() {
        a = b = 0;
    }

    RationalFraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    void reduce() {
        for (int i = 1; i <= Math.abs(a) ; i++) {
            if (a % i == 0) {
                if (b % i == 0) {
                    a /= i;
                    b /= i;
                }
            }
        }
    }

    RationalFraction add(RationalFraction rationalFraction) {
        RationalFraction newdrob = new RationalFraction
                ((this.a * rationalFraction.b) + (rationalFraction.a * this.b), (this.b * rationalFraction.b));
        newdrob.reduce();
        return newdrob;
    }

    void add2(RationalFraction rationalFraction) {
        a = (a * rationalFraction.b) + (rationalFraction.a * b);
        b *= rationalFraction.b;
        this.reduce();
    }

    RationalFraction sub(RationalFraction rationalFraction) {
        RationalFraction newdrob = new RationalFraction
                ((this.a * rationalFraction.b) - (rationalFraction.a * this.b), (this.b * rationalFraction.b));
        newdrob.reduce();
        return newdrob;
    }

    void sub2(RationalFraction rationalFraction) {
        a = (a * rationalFraction.b) - (rationalFraction.a * b);
        b *= rationalFraction.b;
        this.reduce();
    }

    RationalFraction mult(RationalFraction rationalFraction) {
        RationalFraction newdrob = new RationalFraction
                ((this.a * rationalFraction.a), (this.b * rationalFraction.b));
        newdrob.reduce();
        return newdrob;
    }

    void mult2(RationalFraction rationalFraction) {
        a *= rationalFraction.a;
        b *= rationalFraction.b;
        this.reduce();
    }

    RationalFraction div(RationalFraction rationalFraction) {
        RationalFraction newdrob = new RationalFraction
                ((this.a * rationalFraction.b), (this.b * rationalFraction.a));
        newdrob.reduce();
        return newdrob;
    }

    void div2(RationalFraction rationalFraction) {
        a *= rationalFraction.b;
        b *= rationalFraction.a;
        this.reduce();
    }

    @Override
    public String toString() {
        return (a + " / " + b);
    }

    double value() {
        return ((double)a / b);
    }

    boolean equals(RationalFraction rationalFraction) {
        this.reduce();
        rationalFraction.reduce();
        return (a == rationalFraction.a) && (b == rationalFraction.b) && (this.value() == rationalFraction.value());
    }

    int numberPart() {
        return (a / b);
    }
}
