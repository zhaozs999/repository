package com.zhaozs.service;

import com.zhaozs.dao.ProceduresDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 喜鹊 on 2019/7/22.
 */
@Service
public class ProceduresService {
    @Autowired
    ProceduresDAO proceduresDAO;

    public void prodedure(BigDecimal id) {
        Map<String, Object> params = new HashMap<>();
        params.put("in_param", id);
        proceduresDAO.procedure_test(params);
        System.out.print(params.get("unm") + "----------------->" + params.get("pwd"));
    }
}
