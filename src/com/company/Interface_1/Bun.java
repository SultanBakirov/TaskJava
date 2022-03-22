package com.company.Interface_1;

public class Bun implements Bakedable{
    @Override
    public void cook() {
        System.out.println("Bun cooks 20 minute.");
    }

    @Override
    public void spices() {
        System.out.println("Flour.");
    }
}
