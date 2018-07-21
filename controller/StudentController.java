package com.example.demosql.controller;

import com.example.demosql.entity.Student;
import com.example.demosql.repositroy.StudentRepositroy;
import com.example.demosql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class StudentController {
@Autowired
private StudentService studentService;

    @GetMapping
    public String getAllStu(Model model){
        List<Student> stu =studentService.getAllStudent();

        model.addAttribute("stu",stu);
        return "index";
    }

    @GetMapping("add")
    public String  addPage(){
        return "addStu";
    }

    @PostMapping("add")
    public String addStu(Student student){
        studentService.addStudentInfo(student);
        return "redirect:/";
    }
    @GetMapping("update/{id}")
    public String updatePage(@PathVariable("id") Integer id,Model model){
        Student stu=studentService.getStudentById(id);
        model.addAttribute("stu",stu);
        return "updateStu";
    }

    @PostMapping("update")
    public String updateStu(@PathVariable("id") Integer id,Student student){
        student.setStuID(id);
        studentService.updateStudentInfo(student);
        return "redirect:/";
    }
    @GetMapping("delete/{id}")
    public String deletePage(@PathVariable("id")  Integer id){
        studentService.deleteById(id);
        return  "redirect:/";
    }
}
