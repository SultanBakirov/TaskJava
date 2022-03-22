package com.company.Inheritance;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String names, String designation, String groupName) {
        super(names, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println("She is dancing very well");
    }

    @Override
    public void learn() {
        System.out.println("She learn more about the another dancers");
    }

    @Override
    public void walk() {
        System.out.println("She like walking alone");
    }

    @Override
    public void eat() {
        System.out.println("She like eat sandwiches");
    }

    @Override
    public String toString() {
        return "She name is " + getNames() + ". She is " + getDesignation() + ". She dance at " + getGroupName();
    }
}
