package com.company.Homework_12;

public class Triangle {
    int a;
    int b;
    int c;

    public void area() {
        float p = (a + b + c) / 2f;
        float area = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Square of triangle: " + area);
    }
}
