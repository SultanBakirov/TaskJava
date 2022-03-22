package com.company.Inheritance;

public class Singer extends Person{
    private String bandName;

    public Singer(String names, String designation, String bandName) {
        super(names, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println("They sing very beautiful");
    }

    public void playGuitar() {
        System.out.println("He plays nice");
    }

    @Override
    public void learn() {
        System.out.println("They learn about the other singers");
    }

    @Override
    public void walk() {
        System.out.println("They like walking");
    }

    @Override
    public void eat() {
        System.out.println("They usually eat in fast foods");
    }

    @Override
    public String toString() {
        return "She name is " + getNames() + ". She sings " + getDesignation() + ". She sings at " + getBandName() + " group";
    }
}
