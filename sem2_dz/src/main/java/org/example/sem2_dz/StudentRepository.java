package org.example.sem2_dz;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class StudentRepository {
    private final List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
        students.add(new Student("Ivan", "Java Web"));
        students.add(new Student("Ivan", "Python Web"));
        students.add(new Student("Mariya", "Java Web"));
        students.add(new Student("Petr", "Java Web"));
        students.add(new Student("Ivanka", "Python Web"));
        students.add(new Student("Sidor", "Testing"));
        students.add(new Student("Anna", "Testing"));
        students.add(new Student("Aleksey", "Testing"));
        students.add(new Student("Aleksandra", "Java Web"));
        students.add(new Student("Oleg", "Python Web"));
    }

    public Student getStudentById(long id) {
        return students.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public List<Student> getAllStudents() {
        return List.copyOf(students);
    }

    public List<Student> getStudentsByName(String name) {
        return students.stream()
                .filter(it -> it.getName().contains(name))
                .toList();
    }

    public List<Student> getStudentsByGroup(String group) {
        return students.stream()
                .filter(it -> Objects.equals(it.getGroup(), group))
                .toList();
    }

    public List<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    public List<Student> deleteStudent(long id) {
        Student student = getStudentById(id);
        students.remove(student);
        return students;
    }


}
