package com.company.Constructor_1;

public class Student {
    private String dateOfBirth;
    private String name;
    private String surname;
    private int age;

    public Student(String dateOfBirth, String name, String surname, int age) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student() {
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        if (age < 0) {
            System.out.println("Please write correct your age again");
        }
            return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
