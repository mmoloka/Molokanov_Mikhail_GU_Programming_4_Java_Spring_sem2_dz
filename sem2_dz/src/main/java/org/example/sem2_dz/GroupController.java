package org.example.sem2_dz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {
    private StudentRepository studentRepository;

    @Autowired
    public GroupController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(path = "/group/{groupName}/student", method = RequestMethod.GET)
    public List<Student> getStudentsByGroup(@PathVariable String groupName) {
        return studentRepository.getStudentsByGroup(groupName);
    }
}
