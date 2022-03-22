package com.company.Constructor_2;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Bui", 1);
        System.out.println(fish.getName());
        System.out.println(fish.getAge());

        Parrot parrot = new Parrot("Alex", 2);
        System.out.println(parrot.getName());
        System.out.println(parrot.getAge());

        Cat cat = new Cat("Garfield", 3);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        Dog dog = new Dog("Rax", 4);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
    }
}
