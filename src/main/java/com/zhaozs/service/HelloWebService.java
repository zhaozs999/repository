package com.zhaozs.service;

import com.zhaozs.entity.ClassName;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by 喜鹊 on 2019/7/28.
 */
@WebService
public class HelloWebService {

    @Autowired
    ClassNameService classNameService;

    public List<ClassName> helloWebService(ClassName className) {
        List<ClassName> list = classNameService.queryAllClassName(className);
        return list;
    }
}
