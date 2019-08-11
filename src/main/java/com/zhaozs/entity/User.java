package com.zhaozs.entity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/3/25
 * @ 描述
 */
public class User {
    @JsonSerialize
    private BigDecimal id;
    private String userName;
    private String password;
    private String gender;
    private Integer age;
    private Integer category;
    private Date regist_date;
    private String status;
    @JsonSerialize
    private BigDecimal stu_id;
    @JsonSerialize
    private BigDecimal role_id;
    @JsonSerialize
    private BigDecimal jurisdiction_id;
    private Integer isDelete;

    public User() {
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategoty(Integer category) {
        this.category = category;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getRegist_date() {
        return regist_date;
    }

    public void setRegist_date(Date regist_date) {
        this.regist_date = regist_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getStu_id() {
        return stu_id;
    }

    public void setStu_id(BigDecimal stu_id) {
        this.stu_id = stu_id;
    }

    public BigDecimal getRole_id() {
        return role_id;
    }

    public void setRole_id(BigDecimal role_id) {
        this.role_id = role_id;
    }

    public BigDecimal getJurisdiction_id() {
        return jurisdiction_id;
    }

    public void setJurisdiction_id(BigDecimal jurisdiction_id) {
        this.jurisdiction_id = jurisdiction_id;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", categoty=" + category +
                ", regist_date=" + regist_date +
                ", status='" + status + '\'' +
                ", stu_id=" + stu_id +
                ", role_id=" + role_id +
                ", jurisdiction_id=" + jurisdiction_id +
                ", isDelete=" + isDelete +
                '}';
    }
}
