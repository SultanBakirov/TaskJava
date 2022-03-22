package com.company.Inheritance;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Arlen", "software engineer", "Google");
        Dancer dancer = new Dancer("Irina Kairatovna", "Eastern dance", "Jyldyz");
        Singer singer = new Singer("Svetlana Nazarenko", "classic music", "Gorod 312");
        System.out.println(programmer + ".\n" + dancer + ".\n" + singer);
    }
}
