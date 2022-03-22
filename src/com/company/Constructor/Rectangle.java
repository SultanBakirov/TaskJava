package com.company.Constructor;

public class Rectangle {
    private int length;
    private int wight;

    public Rectangle(int length, int wight) {
        this.length = length;
        this.wight = wight;
    }

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
}
