package com.company.OOP;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processor = "AMD Ryzen";
        computer.RAM = 12;
        computer.memory = 132;
        System.out.println(computer.processor);
        System.out.println(computer.RAM);
        System.out.println(computer.memory);

        Computer computer1 = new Computer();
        computer1.processor = "Core i5";
        computer1.RAM = 16;
        computer1.memory = 264;
        System.out.println(computer1.processor);
        System.out.println(computer1.RAM);
        System.out.println(computer1.memory);

        Computer computer2 = new Computer();
        computer2.processor = "Core i7";
        computer2.RAM = 8;
        computer2.memory = 512;
        System.out.println(computer2.processor);
        System.out.println(computer2.RAM);
        System.out.println(computer2.memory);
    }
}
