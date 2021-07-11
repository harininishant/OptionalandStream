package io.pragra.mavenlearning2;

import java.util.Objects;
import java.util.Optional;

public class Student {
private String name;
private String course;
private int age;

    public Student(String name, String course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                '}';
    }

    //    public Optional <String> getName() {
//        return Optional.ofNullable(name);
//    }
//
//    public Optional <String> getCourse() {
//        return Optional.ofNullable(course);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, age);
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }
}
