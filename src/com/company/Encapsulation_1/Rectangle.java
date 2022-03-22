package com.company.Encapsulation_1;

public class Rectangle {
    private int length;
    private int wight;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public void area() {
        System.out.println("Square area: " + length * wight);
    }
}
