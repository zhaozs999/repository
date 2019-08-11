package com.zhaozs.dao;

import com.zhaozs.entity.Course;

import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/1
 * @ 描述
 */
public interface CourseDao {

    // 批量添加
    void insertBatchCourse(List<Course> list);

    // 批量删除
    void deleteBatchCourse(List<Course> list);

    // 批量修改
    void updateBatchCourse(List<Course> list);

    // 查询所有
    List<Course> selectAllCourse();

}
