package com.company.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Person[] person = {new Programmer(), new Dancer(), new Singer()};
        for (Person people: person) {
            people.walk();
        }

    }
}
