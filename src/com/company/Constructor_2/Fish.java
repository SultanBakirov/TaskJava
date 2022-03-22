package com.company.Constructor_2;

public class Fish {
    private String name;
    private int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Fish() {
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
