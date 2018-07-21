package com.example.demosql.controller;

import com.example.demosql.entity.Student;


import com.example.demosql.repositroy.StudentRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentRestController {
    @Autowired
    private StudentRepositroy studentRepositroy;

    @GetMapping("/stu")
    public List<Student> getAllStu() {
        return studentRepositroy.findAll();

    }

    /**
     * 添加学生
     * @param student
     * @return
     */

    @PostMapping("/addStu")
    public Student addStuInfo(Student student){
        Student stu=studentRepositroy.save(student);
        return stu;
    }

    /**
     * 根据id查找
     * @param stuID
     * @return
     */
    @GetMapping("/findById/{id}")
    public Optional<Student> getById(@PathVariable("id") Integer stuID){
        Optional<Student> stu=studentRepositroy.findById(stuID);
        return stu;
    }

    /**
     * 根据id修改
     * @param stuID
     * @param student
     * @return
     */
    @PutMapping("/updateStu/{id}")
    public Student modifyById(@PathVariable("id") Integer stuID,Student student){
        student.setStuID(stuID);
        Student stu=studentRepositroy.save(student);
        return stu;
    }

    /**
     * 根据id来选择删除数据
     * @param id
     */
    @DeleteMapping("/deleteById/{id}")
    public void DeleteById(@PathVariable("id") Integer id){
        studentRepositroy.deleteById(id);

    }
}
