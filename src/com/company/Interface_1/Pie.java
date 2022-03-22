package com.company.Interface_1;

public class Pie implements Bakedable{
    @Override
    public void cook() {
        System.out.println("Pie cooks 40 minute.");
    }

    @Override
    public void spices() {
        System.out.println("Flour.");
    }
}
