package com.wu.learning.StudentDirectory.DAO;

import com.wu.learning.StudentDirectory.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StudentDAO extends CrudRepository<Student,String> {

}
