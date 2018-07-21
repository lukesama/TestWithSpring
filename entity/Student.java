package com.example.demosql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    //表数据
    //创建表
    @Id
    @GeneratedValue
    private Integer stuID;
    private  String stuName;
    private String stuPwd;
    private  String stuPhone;
    private String stuAddress;

    public Student() {
    }

    public void setStuID(Integer stuID) {
        this.stuID = stuID;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public Integer getStuID() {

        return stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public String getStuAddress() {
        return stuAddress;
    }
}
