package com.company.Homework_17;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = {new Shark(), new Turtle(), new Eagle()};

        for (Animal animals: animal) {
            if (animals instanceof Shark) {
                ((Shark) animals).attack();
            } else if (animals instanceof Turtle) {
                ((Turtle) animals).swim();
            } else if (animals instanceof Eagle) {
                ((Eagle) animals).fly();
            }
        }

        for (Animal animals1: animal) {
            if (animals1.getClass().getName().equals("com.company.Homework_17.Shark")) {
                ((Shark) animals1).attack();
            } else if (animals1.getClass().getName().equals("com.company.Homework_17.Turtle")) {
                ((Turtle) animals1).swim();
            } else if (animals1.getClass().getName().equals("com.company.Homework_17.Eagle")) {
                ((Eagle) animals1).fly();
            }
        }

        Shark[] sharks = {(Shark) animal[0]};
        Turtle[] turtles = {(Turtle) animal[1]};
        Eagle[] eagle = {(Eagle) animal[2]};
    }
}
