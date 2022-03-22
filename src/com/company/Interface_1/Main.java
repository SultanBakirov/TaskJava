package com.company.Interface_1;

public class Main {
    public static void main(String[] args) {
        Bakedable[] bakes = {new Bread(), new Bun(), new Pie()};
        for (Bakedable bake: bakes) {
            bake.cook();
            bake.spices();
        }
    }
}
