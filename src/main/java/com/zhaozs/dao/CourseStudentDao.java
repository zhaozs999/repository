package com.zhaozs.dao;

import com.zhaozs.entity.CourseStudent;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/2
 * @ 描述
 */
public interface CourseStudentDao {

    // 添加
    void insertCourseStudent(CourseStudent student);

    // 删除
    void deleteCourseStudent(BigDecimal id);

    // 修改
    void updateCourseStudent(CourseStudent student);

    // 查一个
    CourseStudent  selectCourseStudent(BigDecimal id);

    // 查询所有
    List<CourseStudent> selectAllCourseStudent();
}
