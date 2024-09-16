package com.wu.learning.StudentDirectory.Service;


import com.wu.learning.StudentDirectory.DAO.StudentDAO;
import com.wu.learning.StudentDirectory.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentDAO studentDAO;

    public List<Student> getAllStudents(){
        List<Student>result=(List<Student>)studentDAO.findAll();
        if(result.size()>0)
            return result;
        return new ArrayList<Student>();
    }
    public Student getStudentById(String id){
        Optional<Student> student= studentDAO.findById(id);
        if(student.isPresent())
            return student.get();
        return null;
    }
    public Student createOrUpdateStudent(Student student){
        if(student.getStudent_id()==null){
            student=studentDAO.save(student);
            return student;
        }
        else{
            Optional<Student>result=studentDAO.findById(student.getStudent_id());
            if(result.isPresent()){
                Student student2=result.get();
                student2.setAddress(student.getAddress());
                student2.setName(student.getName());
                student2.setContact(student.getContact());
                student2=studentDAO.save(student2);
                return student2;
            }
            else{
                student=studentDAO.save(student);
                return student;
            }
        }
    }
    public void deleteStudentById(String id){
        Optional<Student> res=studentDAO.findById(id);
        if(res.isPresent())
            studentDAO.deleteById(id);
        return;
    }

}
