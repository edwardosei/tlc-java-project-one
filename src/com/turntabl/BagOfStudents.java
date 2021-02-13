package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {

    private List<Student> bagOfStudents = new ArrayList<>();

    public void addStudent(Student student) {

        this.bagOfStudents.add(student);

    }

    public void removeStudent(Student student) {
        this.bagOfStudents.remove(student);
    }

    public void clearAllStudent(Student student) {
        this.bagOfStudents.clear();
    }

}
