package ru.itis;

import org.jetbrains.annotations.Contract;

public class Vector2D {
    private double a, b;
    Vector2D() {
        a = 0;
        b = 0;
    }

    Vector2D(double a, double b) {
        this.a = a;
        this.b = b;
    }

    Vector2D add(Vector2D vector2D) {
        return new Vector2D(a + vector2D.a, b + vector2D.b);
    }

    void add2(Vector2D vector2D) {
        a += vector2D.a;
        b += vector2D.b;
    }

    Vector2D sub(Vector2D vector2D) {
        return new Vector2D(a - vector2D.a, b - vector2D.b);
    }

    void sub2(Vector2D vector2D) {
        a -= vector2D.a;
        b -= vector2D.b;
    }

    Vector2D mult(double x) {
        return new Vector2D(a * x, b * x);
    }

    void mult2(double x) {
        a *= x;
        b *= x;
    }

    @Contract(pure = true)
    public String toString() {
        return ("(" + a + "; " + b + ")");
    }

    double length() {
        return Math.sqrt(a * a + b * b);
    }

    double scalarProduct(Vector2D vector2D) {
        return (a * vector2D.a + b * vector2D.b);
    }

    double cos(Vector2D vector2D) {
        return (scalarProduct(vector2D) / (this.length() * vector2D.length()));
    }

    boolean equals(Vector2D vector2D) {
        return ((a == vector2D.a) && (b == vector2D.b) && (this.length() == vector2D.length()));
    }
}
