package com.zhaozs.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/3/28
 * @ 描述
 */
public class ClassName {
    private BigDecimal id;
    private BigDecimal pId;
    private BigDecimal userStudentId;
    private String className;
    private Integer isDelete;
    private List<User> studentList;
    private List<User> teqcherList;

    public ClassName() {
    }

    public BigDecimal getId() {
        return id;
    }

    public BigDecimal getpId() {
        return pId;
    }

    public void setpId(BigDecimal pId) {
        this.pId = pId;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }

    public List<User> getTeqcherList() {
        return teqcherList;
    }

    public void setTeqcherList(List<User> teqcherList) {
        this.teqcherList = teqcherList;
    }

    public BigDecimal getUserStudentId() {
        return userStudentId;
    }

    public void setUserStudentId(BigDecimal userStudentId) {
        this.userStudentId = userStudentId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "ClassName{" +
                "id=" + id +
                ", pId=" + pId +
                ", userStudentId=" + userStudentId +
                ", className='" + className + '\'' +
                ", isDelete=" + isDelete +
                ", studentList=" + studentList +
                ", teqcherList=" + teqcherList +
                '}';
    }
}
