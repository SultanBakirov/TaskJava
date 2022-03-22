package com.company.Homework_13;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Bui");
        fish.setAge(2);
        System.out.println(fish.getName());
        System.out.println(fish.getAge());

        Cat cat = new Cat();
        cat.setName("Garfield");
        cat.setAge(1);
        System.out.println(fish.getName());
        System.out.println(fish.getAge());

        Dog dog = new Dog();
        dog.setName("Rax");
        dog.setAge(4);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());

        Parrot parrot = new Parrot();
        parrot.setName("Alex");
        parrot.setAge(3);
        System.out.println(parrot.getName());
        System.out.println(parrot.getAge());

    }
}
