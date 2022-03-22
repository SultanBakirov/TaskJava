package com.company.Constructor_1;

public class Course {
    private String name;
    private int number;
    private String teacherName;
    private String startDate;

    public Course(String name, int number, String teacherName, String startDate) {
        this.name = name;
        this.number = number;
        this.teacherName = teacherName;
        this.startDate = startDate;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
