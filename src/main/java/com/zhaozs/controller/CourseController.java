package com.zhaozs.controller;

import com.zhaozs.entity.Course;
import com.zhaozs.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/1
 * @ 描述
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    // 批量添加
    @RequestMapping(value = "/addBatchCourse", method = RequestMethod.POST)
    public void addBatchCourse(@RequestBody List<Course> list) {
        courseService.addBatchCourse(list);
    }

    // 批量删除
    @RequestMapping(value = "/dropBatchCourse", method = RequestMethod.POST)
    public void dropBatchCourse(@RequestBody List<Course> list) {
        courseService.dropBatchCourse(list);
    }

    // 批量修改
    @RequestMapping(value = "/modifyBatchCourse", method = RequestMethod.POST)
    public void modifyBatchCourse(@RequestBody List<Course> list) {
        courseService.modifyBatchCourse(list);
    }

    // 列表
    @RequestMapping(value = "/queryAllCourse", method = RequestMethod.POST)
    public List<Course> queryAllCourse() {
        List<Course> courses = courseService.queryAllCourse();
        return courses;
    }

}
