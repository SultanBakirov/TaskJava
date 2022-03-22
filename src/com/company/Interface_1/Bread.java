package com.company.Interface_1;

public class Bread implements Bakedable{
    @Override
    public void cook() {
        System.out.println("Bread cooks 30 minute.");
    }

    @Override
    public void spices() {
        System.out.println("Flour.");
    }
}
