package com.sarvesh.student_app_docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return repo.findAll();
    }

    @RequestMapping("/addStudents")
    public void addStudent(){
        Student s = new Student();
        s.setName("Sarvesh");
        s.setAge(21);
        repo.save(s);
    }

}
