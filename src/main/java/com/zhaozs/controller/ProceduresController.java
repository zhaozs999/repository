package com.zhaozs.controller;

import com.zhaozs.service.ProceduresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;

/**
 * Created by 喜鹊 on 2019/7/22.
 */
@Controller
@RequestMapping(value = "/produces")
public class ProceduresController {
    @Autowired
    ProceduresService proceduresService;

    @RequestMapping(value = "/full", method = RequestMethod.POST)
    public void producees() {
        BigDecimal id = BigDecimal.valueOf(1553770782148L);
        proceduresService.prodedure(id);
    }
}
