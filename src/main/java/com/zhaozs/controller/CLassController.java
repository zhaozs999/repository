package com.zhaozs.controller;

import com.zhaozs.entity.ClassName;
import com.zhaozs.service.ClassNameService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/3
 * @ 描述
 */
@CrossOrigin
@RestController
@RequestMapping("/class")
public class CLassController {

    @Autowired
    ClassNameService classNameService;

    // 批量添加
    @RequestMapping(value = "/addBatchClass", method = RequestMethod.POST)
    public void addBatchClass(@RequestBody List<ClassName> list) {
        classNameService.addBatchClassName(list);
    }

    // 批量删除
    @RequestMapping(value = "/dropBatchClass", method = RequestMethod.POST)
    public void dropBatchClass(@RequestBody List<ClassName> ids) {
        classNameService.dropBatchClassName(ids);
    }

    // 批量修改
    @RequestMapping(value = "/modifyBatchClass", method = RequestMethod.POST)
    public void modifyBatchClass(@RequestBody List<ClassName> list) {
        classNameService.modifyBatchClassName(list);
    }

    // 查看详情
    @RequestMapping(value = "/queryByIdClass", method = RequestMethod.POST)
    public ClassName queryByIdClass(@RequestBody ClassName className) {
        ClassName cn = classNameService.queryByIdClassName(className);
        return cn;
    }

    // 查看列表
    @RequestMapping(value = "/queryAllClass", method = RequestMethod.POST)
    public List<ClassName> queryAllClass(@RequestBody ClassName className) {
        /*res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Allow-Methods", "*");
        res.setHeader("Access-Control-Max-Age", "3600");
        res.setHeader("Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Type, Accept");*/
        List<ClassName> list = classNameService.queryAllClassName(className);
        return list;
    }

}
