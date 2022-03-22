package com.company.Homework_18;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(30, 3, "male", "Marta");
        Cow cow1 = new Cow(30, 3, "male", "Marta");
        Cow cow2 = new Cow(30, 3, "male", "Marta");
        Cow cow3 = new Cow(30, 3, "male", "Marta");
        Cow cow4 = new Cow(30, 3, "male", "Marta");
        Cow cow5 = new Cow(30, 3, "male", "Marta");
        Cow[] cows = {cow1,cow2,cow3,cow4,cow5};
        Cow[] cows1 = {cow};
        Sheep sheep1 = new Sheep(25, 2, "female", "Koza");
        Sheep sheep2 = new Sheep(25, 2, "female", "Koza");
        Sheep sheep3 = new Sheep(25, 2, "female", "Koza");
        Sheep sheep4 = new Sheep(25, 2, "female", "Koza");
        Sheep[] sheep = {sheep1,sheep2,sheep3};
        Sheep[] sheep5 = {sheep4};
        Horse horse = new Horse(70, 5, "black", "male", "Shumkar");
        Horse horse1 = new Horse(70, 5, "black", "male", "Shumkar");
        Horse horse2 = new Horse(70, 5, "black", "male", "Shumkar");
        Horse[] horses = {horse1,horse2};
        Horse[] horses1 = {horse};
        Farm farm = new Farm("Bishkek", cows, horses, sheep, "Arlen");
        System.out.println(farm);
        farm.farm1Method();

        Farm farm1 = new Farm("Warsaw", cows1, horses1, sheep5, "Sultan");
        System.out.println(farm1);
        farm1.farm1Method();
    }
}
