package by.epam.main;

import by.epam.entity.Student;
import by.epam.report.ReportStudent;
import by.epam.service.ServiceStudent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Ансимова", "Елизавета", "Андреевна",
                LocalDate.of( 1996 , 1 , 12 ), "Нямига 30",
                "+375291234567", "таможенное дело", 2, "1301");
        Student student2 = new Student(2, "Беляев", "Матвей", "Артёмович",
                LocalDate.of( 1997 , 8 , 10 ), "Нямига 30",
                "+375291234567", "таможенное дело", 2, "1301");
        Student student3 = new Student(3, "Горбушин", "Виталий", "Валерьевич",
                LocalDate.of( 1995 , 4 , 24 ), "Нямига 30",
                "+375291234567", "таможенное дело", 3, "1302");
        Student student4 = new Student(4, "Гриненко", "Алексей", "Алексеевич",
                LocalDate.of( 1996 , 3 , 29 ), "Нямига 30",
                "+375291234567", "юриспруденция", 4, "1303");
        Student student5 = new Student(5, "Грунталь", "Марк", "Альбертович",
                LocalDate.of( 1996 , 12 , 30 ), "Нямига 30",
                "+375291234567", "юриспруденция", 5, "1303");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        ServiceStudent service = new ServiceStudent();
        List<Student> facultySearch = service.facultySearch(studentList, "юриспруденция");
        List<Student> facultyAndCourseSearch = service.facultyAndCourseSearch(studentList, "юриспруденция", 5);
        List<Student> findYear = service.findYear(studentList, 1996);
        List<Student> findGroup = service.findGroup(studentList, "1303");

        ReportStudent report = new ReportStudent();
        report.print(facultySearch);
        report.print(facultyAndCourseSearch);
        report.print(findYear);
        report.print(findGroup);
    }
}
