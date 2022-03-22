package com.company.Modifier;

import java.time.LocalDate;

public class Student {
    private LocalDate dateOfBirth;
    private String name;
    private String surname;
    private String eMail;

    public Student() {
    }

    public Student(LocalDate dateOfBirth, String name, String surname, String eMail) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
    }

    void studentJava() {
        System.out.println(getDateOfBirth() + " " + getName() + " " + getSurname()+ " " + geteMail());
    }



    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.equals(LocalDate.of(2022,03,22))) {
            System.out.println("It is wrong");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
