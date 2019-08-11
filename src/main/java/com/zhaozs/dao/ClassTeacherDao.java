package com.zhaozs.dao;

import com.zhaozs.entity.ClassTeacher;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/2
 * @ 描述
 */
public interface ClassTeacherDao {

    // 添加
    void insertClassTeacher(ClassTeacher classTeacher);

    // 删除
    void deleteClassTeacher(BigDecimal id);

    // 修改
    void updateClassTeachere(ClassTeacher classTeacher);

    // 查一个
    ClassTeacher selectClassTeacher(BigDecimal id);

    // 查询所有
    List<ClassTeacher> selectAllClassTeacher();
}
