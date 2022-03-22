package com.company.Constructor_1;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java", 5, "Muhamed Allanov", "3 of January");
        System.out.println(course.getName());
        System.out.println(course.getNumber());
        System.out.println(course.getTeacherName());
        System.out.println(course.getStartDate());
        Student student = new Student("1 of March", "Sultan", "Bakirov", 10);
        System.out.println(student.getDateOfBirth());
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAge());
    }
}
