package com.turntabl;

import java.util.ArrayList;

public class Register {
    protected ArrayList<Student> studentRegister;

    public Register(ArrayList<Student> People) {
        this.studentRegister = People;
    }

    public ArrayList<String> getRegister() {
        ArrayList<String> studentNames =  new ArrayList<>();
        for(Student student : studentRegister) {
            studentNames.add(student.getName());
        }
        return studentNames;
    }

    public ArrayList<Student> getRegisterByLevel(Level level) {
//        ArrayList<Student> studentOfLevel = new ArrayList<>();
        ArrayList<Student> studentNames =  new ArrayList<>();
        for(Student aStudent: studentRegister) {
            if (aStudent.getLevel() == level) {
                studentNames.add(aStudent);
            }
        }

//        studentOfLevel.add(studentNames);
        return studentNames;
    }
}
