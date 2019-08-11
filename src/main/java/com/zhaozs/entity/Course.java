package com.zhaozs.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/3/28
 * @ 描述
 */
public class Course {
    private BigDecimal id;
    private String courseName;
    private List<User> studentList;
    private List<User> teacherList;

    public Course() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }

    public List<User> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<User> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", studentList=" + studentList +
                ", teacherList=" + teacherList +
                '}';
    }
}
