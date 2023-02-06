package com.gio.spring.rest;

import com.gio.spring.entity.Student;
import com.gio.spring.exceptions.StudentNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Gis", "Charkvi"));
        theStudents.add(new Student("Baba", "Guguani"));
        theStudents.add(new Student("Avto", "Kencho"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if(studentId >= theStudents.size() || studentId < 0)
            throw new StudentNotFoundException("Student id not found - " + studentId);

        return theStudents.get(studentId);
    }


}
