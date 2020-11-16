package by.epam.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate birthday;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String surname, String name, String patronymic,
                   LocalDate birthday, String address, String phone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                course == student.course &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(name, student.name) &&
                Objects.equals(patronymic, student.patronymic) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(address, student.address) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(faculty, student.faculty) &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, birthday, address, phone, faculty, course, group);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", address='").append(address).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", faculty='").append(faculty).append('\'');
        sb.append(", course=").append(course);
        sb.append(", group='").append(group).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
