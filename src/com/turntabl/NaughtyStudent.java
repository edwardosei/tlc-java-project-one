package com.turntabl;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> studentGrades) {
        super(studentGrades);
    }

    public NaughtyStudent(List<Double> studentGrades, Level level) {
        super(studentGrades, level);
    }

    public NaughtyStudent(String name) {
        super(name);
    }

    public NaughtyStudent(List<Double> studentGrades, String name, Level level) {
        super(studentGrades, name, level);
    }

    public double getAverageGrade() {
        double trueAverageGrade = super.getAverageGrade();
        double increase = trueAverageGrade * 0.1;
        double falseAverageGrade = trueAverageGrade + increase;
        return falseAverageGrade;
    }
}
