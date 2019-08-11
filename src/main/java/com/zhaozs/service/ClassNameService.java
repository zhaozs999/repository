package com.zhaozs.service;

import com.zhaozs.dao.CLassNameDao;
import com.zhaozs.entity.ClassName;
import com.zhaozs.utils.Utils;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/3
 * @ 描述
 */
@Service
public class ClassNameService{
    @Autowired
    CLassNameDao cLassNameDao;

    // 批量添加
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED, timeout = -1, propagation = Propagation.REQUIRED)
    public void addBatchClassName(List<ClassName> className) {
        for (ClassName name : className) {
            BigDecimal id = Utils.getRandomId();
            name.setId(id);
        }


        for (int i = 0; i < 999999999; i++) {
            System.out.println("=============" + i);
        }


        cLassNameDao.insertBatchClass(className);
    }

    // 批量删除
    public void dropBatchClassName(List<ClassName> classNamems) {
        cLassNameDao.deleteBatchClassName(classNamems);

    }

    // 批量修改
    public void modifyBatchClassName(List<ClassName> classNames) {
        cLassNameDao.updateBatchClassName(classNames);
    }

    // 查详情
    public ClassName queryByIdClassName(ClassName className) {
        ClassName cn = cLassNameDao.selectByIdClassName(className.getId());
        return cn;
    }

    // 差所有
    public List<ClassName> queryAllClassName(ClassName className) {
        /*try {
            String endpoint = "http://localhost:8080/ca3/services/caSynrochnized?wsdl";
            // 直接引用远程的wsdl文件
            // 以下都是套路
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(endpoint);
            call.setOperationName("addUser");// WSDL里面描述的接口名称
            call.addParameter("userName",
                    org.apache.axis.encoding.XMLType.XSD_DATE,
                    javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// 设置返回类型
            String temp = "测试人员";
            String result = (String) call.invoke(new Object[] { temp });
            // 给方法传递参数，并且调用方法
            System.out.println("result is " + result);
        } catch (Exception e) {
            System.err.println(e.toString());
        }*/
        List<ClassName> classNames = cLassNameDao.selectAllClassName(className.getClassName(),
                                                                     className.getIsDelete());
        return classNames;
    }

}
