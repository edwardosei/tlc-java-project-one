package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private List<Student> students = new ArrayList<>();

    public void enter(Student student) {

        this.students.add(student);

    }

    public double getHighestAverageGrade() {

        double highestAverageGrade = 0;

        double averageGrade = 0;

        for (int i = 0; i < this.students.size(); i++) {

            averageGrade = this.students.get(i).getAverageGrade();

            if (averageGrade > highestAverageGrade)
                highestAverageGrade = averageGrade;

        }

        return highestAverageGrade;
    }
}
