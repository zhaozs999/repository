package com.zhaozs.entity;

import java.math.BigDecimal;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/2
 * @ 描述
 */
public class CourseStudent {
    private BigDecimal id;
    private BigDecimal userId;
    private BigDecimal courseId;

    public CourseStudent() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getCourseId() {
        return courseId;
    }

    public void setCourseId(BigDecimal courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "CourseStudent{" +
                "id=" + id +
                ", userId=" + userId +
                ", courseId=" + courseId +
                '}';
    }
}
