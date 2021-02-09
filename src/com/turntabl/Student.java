package com.turntabl;

import java.util.List;

public class Student implements Nameable, HasLevel {
    protected List<Double> studentGrades;
    private String name;
    private Level level;

    public Student(List<Double> studentGrades) {
//        this(studentGrades, name, level);
        this.studentGrades = studentGrades;

    }

    public Student(List<Double> studentGrades, String name) {
        this(studentGrades);
        this.name = name;

    }

    public Student(List<Double> studentGrades, String name, Level level) {
        this(studentGrades, name);
        this.level = level;

    }

    public Student(List<Double> studentGrades, Level level) {
        this(studentGrades);
        this.level = level;

    }

    public double getAverageGrade() {

        double total = 0;

        for (int i = 0; i < studentGrades.size(); i++) {

            total += studentGrades.get(i);

        }

        double averageGrade = total / studentGrades.size();

        return averageGrade;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }
}
