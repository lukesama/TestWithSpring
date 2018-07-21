package com.example.demosql.service;

import com.example.demosql.entity.Student;
import com.example.demosql.repositroy.StudentRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepositroy studentRepositroy;

    @Override
    public List<Student> getAllStudent() {
        return studentRepositroy.findAll();

    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepositroy.findById(id).get();
        //optional表示可能返回多条记录，get表示返回第一条
    }

    @Override
    public Student addStudentInfo(Student student) {
        return studentRepositroy.save(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentRepositroy.deleteById(id);
    }

    @Override
    public Student updateStudentInfo(Student student) {
        return studentRepositroy.save(student);
    }
}
