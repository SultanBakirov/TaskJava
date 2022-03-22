package com.company.Constructor_2;

public class Parrot {
    private String name;
    private int age;

    public Parrot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Parrot() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
