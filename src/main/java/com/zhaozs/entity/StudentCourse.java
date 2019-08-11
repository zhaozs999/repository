package com.zhaozs.entity;

import java.math.BigDecimal;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/2
 * @ 描述
 */
public class StudentCourse {
    private BigDecimal id;
    private BigDecimal userStudentId;
    private BigDecimal userTeacherId;

    public StudentCourse() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getUserStudentId() {
        return userStudentId;
    }

    public void setUserStudentId(BigDecimal userStudentId) {
        this.userStudentId = userStudentId;
    }

    public BigDecimal getUserTeacherId() {
        return userTeacherId;
    }

    public void setUserTeacherId(BigDecimal userTeacherId) {
        this.userTeacherId = userTeacherId;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "id=" + id +
                ", userStudentId=" + userStudentId +
                ", userTeacherId=" + userTeacherId +
                '}';
    }
}
