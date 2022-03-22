package com.company.Homework_19;

public class Hotel extends Family implements Rent{
    public Hotel(int sum, String address) {
        super(sum, address);
    }

    @Override
    public void paid() {
        System.out.println("575 zl");
    }
}
