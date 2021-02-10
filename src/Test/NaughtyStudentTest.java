package Test;

import com.turntabl.NaughtyStudent;

import com.turntabl.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void naughtyStudentIsAKindOfStudent() {
        NaughtyStudent naughtyStudent = new NaughtyStudent("John");
        Student goodStudent = naughtyStudent;
        assertTrue(naughtyStudent.getName().equals(goodStudent.getName()), "Naughty student is not a kind of student.");
    }

    @Test
    void naughtyStudentAverageGradeIsHigherBy10Percent() {
        ArrayList<Double> grades1 = new ArrayList<>();
        grades1.add(56.00);
        grades1.add(56.00);
        grades1.add(70.00);
        grades1.add(78.00);

        NaughtyStudent ns1 = new NaughtyStudent(grades1);
        Student goodStudent = new Student(grades1);

        assertEquals(ns1.getAverageGrade(), 1.1 * goodStudent.getAverageGrade(), "Naughty student average grade is not 10% higher.");
    }

    @Test
    void naughtyStudentAverageGradeIsHigher() {

        ArrayList<Double> grades1 = new ArrayList<>();
        grades1.add(56.00);
        grades1.add(56.00);
        grades1.add(70.00);
        grades1.add(78.00);

        NaughtyStudent ns1 = new NaughtyStudent(grades1);
        Student goodStudent = new Student(grades1);

        assertTrue(ns1.getAverageGrade() > goodStudent.getAverageGrade(), "Naughty student average grade is not higher.");
    }
}