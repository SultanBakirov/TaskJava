package com.company.Inheritance;

public class Person {
    private String names;
    private String designation;

    public Person(String names, String designation) {
        this.names = names;
        this.designation = designation;
    }

    public void learn() {
    }

    public void walk() {
    }

    public void eat() {
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names='" + names + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
