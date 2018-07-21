package com.example.demosql.service;

import com.example.demosql.entity.Student;

import java.util.List;

public interface StudentService {
    //返回所有学生信息
    List<Student> getAllStudent();
    //查找学生信息
    Student getStudentById(Integer id);
    //添加学生信息
    Student addStudentInfo(Student student);
    //根据id删除学生信息
    void deleteById(Integer id);
    //修改学生信息
    Student updateStudentInfo(Student student);
}
