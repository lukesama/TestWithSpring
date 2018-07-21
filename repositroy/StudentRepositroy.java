package com.example.demosql.repositroy;


import com.example.demosql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositroy extends JpaRepository<Student,Integer> {
    //调用方法的封装

}
