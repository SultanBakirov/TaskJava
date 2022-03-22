package com.company.Modifier;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDateOfBirth(LocalDate.of(2000,03,22));
        student.setName("Sultan");
        student.setSurname("Bakirov");
        student.seteMail("bakirovsultanbek07@gmail.com");
        Student[] students = new Student[]{student};

        Group group = new Group();
        group.setStudents(students);
        group.setTitle("Java OOP");
        group.setDateOfStart(LocalDate.of(2022,01,03));
        Group[] groups1 = new Group[]{group};

        Course course = new Course();
        course.setName("Java");
        course.setNumber(5);
        course.setTeacherName("Muhamed Allanov");
        course.setGroups(groups1);
        course.courseJava();
    }
}
