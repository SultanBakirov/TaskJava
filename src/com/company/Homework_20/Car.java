package com.company.Homework_20;

public class Car implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("The car closed.");
    }

    public void drive() {
        System.out.println("The car is going");
    }
}
