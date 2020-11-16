package by.epam.service;

import by.epam.entity.Student;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceStudent {
    public List<Student> facultySearch (List<Student> student, String faculty) {
        return student.stream().filter(el -> el.getFaculty().equals(faculty)).collect(Collectors.toList());
    }
    public List<Student> facultyAndCourseSearch (List<Student> student, String faculty, int course) {
        return student.stream().filter(el -> el.getFaculty().equals(faculty) && el.getCourse() == course).
                collect(Collectors.toList());
    }
    public List<Student> findYear (List<Student> student, int date) {
        return student.stream().filter(el -> el.getBirthday().getYear() == date).collect(Collectors.toList());
    }
    public List<Student> findGroup (List<Student> student, String group) {
        return student.stream().filter(el -> el.getGroup().equals(group)).collect(Collectors.toList());
    }
}
