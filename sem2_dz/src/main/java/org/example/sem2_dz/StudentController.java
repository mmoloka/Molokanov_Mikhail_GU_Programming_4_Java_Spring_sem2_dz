package org.example.sem2_dz;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable long id) {
        return studentRepository.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getStudents() {
        return studentRepository.getAllStudents();
    }

    @GetMapping("/search")
    public List<Student> getStudentsByName(@RequestParam String name) {
        return studentRepository.getStudentsByName(name);
    }

    @PostMapping
    public List<Student> addStudent(@RequestBody Student student) {
        return studentRepository.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public List<Student> deleteStudent(@PathVariable long id) {
        return studentRepository.deleteStudent(id);
    }
}
