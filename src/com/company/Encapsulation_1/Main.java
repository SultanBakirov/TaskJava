package com.company.Encapsulation_1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(12);
        rectangle.setWight(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWight());
        rectangle.area();
    }
}
