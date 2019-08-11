package com.zhaozs.entity;

import java.math.BigDecimal;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/2
 * @ 描述
 */
public class ClassTeacher {
    private BigDecimal id;
    private BigDecimal userTeacherId;
    private BigDecimal classId;

    public ClassTeacher() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getUserTeacherId() {
        return userTeacherId;
    }

    public void setUserTeacherId(BigDecimal userTeacherId) {
        this.userTeacherId = userTeacherId;
    }

    public BigDecimal getClassId() {
        return classId;
    }

    public void setClassId(BigDecimal classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "ClassTeacher{" +
                "id=" + id +
                ", userTeacherId=" + userTeacherId +
                ", classId=" + classId +
                '}';
    }
}
