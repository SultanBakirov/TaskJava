package com.company.Homework_16;

import java.util.Scanner;

public class Circle {
    private double PI;

    public Circle(double PI) {
        this.PI = PI;
    }

    public static void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is: " + area);
        double circumference= Math.PI * 2 * radius;
        System.out.println("The circumference is equal to: " + circumference);
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                '}';
    }
}
