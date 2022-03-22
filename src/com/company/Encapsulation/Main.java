package com.company.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Java");
        System.out.println(course.getName());
        course.setNumber(5);
        System.out.println(course.getNumber());
        course.setTeacherName("Muhamed Allanov");
        System.out.println(course.getTeacherName());
        course.setStartOfCourse("3 of January 2022 year");
        System.out.println(course.getStartOfCourse());

        Student student = new Student();
        student.setDateOfBirth("15 of July 2001 year");
        System.out.println(student.getDateOfBirth());
        student.setName("Sultan");
        System.out.println(student.getName());
        student.setSurname("Bakirov");
        System.out.println(student.getSurname());
        student.setAge(0);
        System.out.println("Age " + student.getAge());
    }
}
