package com.zhaozs.service;

import com.zhaozs.dao.CourseDao;
import com.zhaozs.entity.Course;
import com.zhaozs.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/1
 * @ 描述
 */
@Service
@Transactional
public class CourseService {

    @Autowired
    CourseDao courseDao;

    // 批量添加
    public void addBatchCourse(List<Course> list) {
        int i = 0;
        for (Course course : list) {
            i ++;
            BigDecimal id = Utils.getRandomId();
            course.setId(id);

            System.out.println(id + "---------------------" + i);
        }

        courseDao.insertBatchCourse(list);
    }

    // 批量删除
    public void dropBatchCourse(List<Course> list) {
        courseDao.deleteBatchCourse(list);
    }

    // 批量修改
    public void modifyBatchCourse(List<Course> list) {
        courseDao.updateBatchCourse(list);
    }

    // 查询所有
    public List<Course> queryAllCourse() {
        List<Course> courses = courseDao.selectAllCourse();
        return courses;
    }
}
