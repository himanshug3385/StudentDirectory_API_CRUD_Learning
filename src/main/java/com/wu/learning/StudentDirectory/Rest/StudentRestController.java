package com.wu.learning.StudentDirectory.Rest;


import com.wu.learning.StudentDirectory.Entity.Student;
import com.wu.learning.StudentDirectory.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @Autowired
    StudentService studentService;

    @GetMapping("")
    public ArrayList<Student> getAllStudents(){
        return (ArrayList<Student>) studentService.getAllStudents();
    }
    @GetMapping("/student")
    public Student getStudentById(@RequestParam("id") String id){
        return (Student)studentService.getStudentById(id);
    }
    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
        Student res= studentService.createOrUpdateStudent(student);
        return res;
    }
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        Student res= studentService.createOrUpdateStudent(student);
        return res;
    }
    @DeleteMapping("/student")
    public void deleteStudent(@RequestParam("name") String id){
        studentService.deleteStudentById(id);

    }
}
