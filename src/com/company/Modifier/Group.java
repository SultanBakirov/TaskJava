package com.company.Modifier;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private Student[] students;
    private String title;
    private LocalDate dateOfStart;

    public Group() {
    }

    public Group(Student[] students, String title, LocalDate dateOfStart) {
        this.students = students;
        this.title = title;
        this.dateOfStart = dateOfStart;
    }

    void groupJava() {
        System.out.println(getTitle() + " " + getDateOfStart());
        for (Student stu: getStudents()) {
            stu.studentJava();
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", title='" + title + '\'' +
                ", dateOfStart='" + dateOfStart + '\'' +
                '}';
    }
}
