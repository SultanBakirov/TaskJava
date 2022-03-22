package com.company.Homework_19;

public class Dormitory extends Family implements Rent{
    public Dormitory(int sum, String address) {
        super(sum, address);
    }

    @Override
    public void paid() {
        System.out.println("625 zl");
    }
}
