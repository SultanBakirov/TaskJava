package com.company.Homework_19;

public class Flat extends Family implements Rent{
    public Flat(int sum, String address) {
        super(sum, address);
    }

    @Override
    public void paid() {
        System.out.println("100 zl");
    }
}
