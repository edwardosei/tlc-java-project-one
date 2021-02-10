package com.turntabl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Double> grades1 = new ArrayList<>();
        grades1.add(56.00);
        grades1.add(56.00);
        grades1.add(70.00);
        grades1.add(78.00);
        Student student1 = new Student(grades1, "Peter", Level.LEVEL100);

        ArrayList<Double> grades2 = new ArrayList<>();
        grades2.add(55.00);
        grades2.add(65.00);
        grades2.add(30.00);
        grades2.add(28.00);
        Student student2 = new Student(grades2, "James", Level.LEVEL100);

        ArrayList<Double> grades3 = new ArrayList<>();
        grades3.add(45.00);
        grades3.add(22.00);
        grades3.add(15.00);
        grades3.add(90.00);
        NaughtyStudent nstudent3 = new NaughtyStudent(grades3, "Violet", Level.LEVEL200);

        ArrayList<Double> grades4 = new ArrayList<>();
        grades4.add(90.00);
        grades4.add(86.00);
        grades4.add(77.00);
        grades4.add(94.00);
        NaughtyStudent nstudent4 = new NaughtyStudent(grades4, "Mary", Level.LEVEL300);

        Lecture lecture = new Lecture();
        lecture.enter(student1);
        lecture.enter(student2);
        lecture.enter(nstudent3);
        lecture.enter(nstudent4);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(nstudent3);

        Register register = new Register(students);

        System.out.println("The Highest Average Grade: " + lecture.getHighestAverageGrade());

        register.getRegisterByLevel(Level.LEVEL100).forEach(student -> System.out.println(student.getName()));


    }
}
