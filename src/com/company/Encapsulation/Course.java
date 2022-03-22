package com.company.Encapsulation;

public class Course {
    private String name;
    private int number;
    private String teacherName;
    private String startOfCourse;

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

    public String getStartOfCourse() {
        return startOfCourse;
    }

    public void setStartOfCourse(String startOfCourse) {
        this.startOfCourse = startOfCourse;
    }
}
