package com.company.Interface;

public class Main {
    public static void main(String[] args) {
        Swimable[] oceanarium = {new Shark(), new Duck(), new Turtle(),
                                new Shark(), new Duck(), new Turtle(),
                                new Shark(), new Duck(), new Turtle(),
                                new Shark(), new Duck(), new Turtle(),
                                new Shark(), new Duck(), new Turtle()};

        for (Swimable animals: oceanarium) {
            animals.swim();
        }
    }
}
