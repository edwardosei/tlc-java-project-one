package com.turntabl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Register {

    protected List<Student> studentRegister;

    public Register(List<Student> People) {
        this.studentRegister = People;
    }

    public List<String> getRegister() {
        List<String> studentNames =  new ArrayList<>();
        for(Student student : studentRegister) {
            studentNames.add(student.getName());
        }
        return studentNames;
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level) {

        Map<Level, List<Student>> studentOfLevel = new HashMap<>();

        List<Student> studentNames =  new ArrayList<>();
        for(Student aStudent: studentRegister) {
            if (aStudent.getLevel() == level) {
                studentNames.add(aStudent);
            }
        }

        studentOfLevel.put(level, studentNames);
        return studentOfLevel;
    }

    public void printReport(Level studentsInLevel) {
        List<String> studentNames =  new ArrayList<>();
        for(Student aStudent: studentRegister) {
            if (aStudent.getLevel() == studentsInLevel) {
                System.out.println("Level:  " + studentsInLevel + " Student Name: " + aStudent.getName());
            }
        }

    }
}
