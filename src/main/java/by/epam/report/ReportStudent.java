package by.epam.report;

import by.epam.entity.Student;

import java.util.List;

public class ReportStudent {
    public void print (List<Student> student) {
        student.stream().forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");
    }
}
