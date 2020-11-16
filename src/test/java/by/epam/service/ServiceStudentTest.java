package by.epam.service;

import by.epam.entity.Student;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ServiceStudentTest {

    private static final Student student1 = new Student(1, "Ансимова", "Елизавета", "Андреевна",
            LocalDate.of( 1996 , 1 , 12 ), "Нямига 30",
            "+375291234567", "таможенное дело", 2, "1301");
    private static final Student student2 = new Student(2, "Беляев", "Матвей", "Артёмович",
            LocalDate.of( 1997 , 8 , 10 ), "Нямига 30",
            "+375291234567", "таможенное дело", 2, "1301");
    private static final Student student3 = new Student(3, "Горбушин", "Виталий", "Валерьевич",
            LocalDate.of( 1995 , 4 , 24 ), "Нямига 30",
            "+375291234567", "таможенное дело", 3, "1302");
    private static final Student student4 = new Student(4, "Гриненко", "Алексей", "Алексеевич",
            LocalDate.of( 1996 , 3 , 29 ), "Нямига 30",
            "+375291234567", "юриспруденция", 4, "1303");
    private static final Student student5 = new Student(5, "Грунталь", "Марк", "Альбертович",
            LocalDate.of( 1996 , 12 , 30 ), "Нямига 30",
            "+375291234567", "юриспруденция", 5, "1303");
    private static final List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5);

    @Test
    public void facultySearch() {
        // Given
        ServiceStudent service = new ServiceStudent();
        // When
        List<Student> actual = service.facultySearch(studentList, "юриспруденция");
        List<Student> expected = new ArrayList<>();
        expected.add(student4);
        expected.add(student5);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void facultyAndCourseSearch() {
        // Given
        ServiceStudent service = new ServiceStudent();
        // When
        List<Student> actual = service.facultyAndCourseSearch(studentList, "юриспруденция", 5);
        List<Student> expected = new ArrayList<>();
        expected.add(student5);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findYear() {
        // Given
        ServiceStudent service = new ServiceStudent();
        // When
        List<Student> actual = service.findYear(studentList, 1996);
        List<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student4);
        expected.add(student5);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findGroup() {
        // Given
        ServiceStudent service = new ServiceStudent();
        // When
        List<Student> actual = service.findGroup(studentList, "1303");
        List<Student> expected = new ArrayList<>();
        expected.add(student4);
        expected.add(student5);
        // Then
        assertEquals(expected, actual);
    }
}
