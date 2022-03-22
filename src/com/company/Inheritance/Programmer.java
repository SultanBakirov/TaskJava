package com.company.Inheritance;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String names, String designation, String companyName) {
        super(names, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public void coding() {
        System.out.println("He is coding code");
    }

    @Override
    public void learn() {
        System.out.println("He learn more about coding");
    }

    @Override
    public void walk() {
        System.out.println("He walks every sunday");
    }

    @Override
    public void eat() {
        System.out.println("He likes eating");
    }

    @Override
    public String toString() {
        return "His name is " + getNames() + ". He works at " + getDesignation() + " at " + getCompanyName();
    }
}
