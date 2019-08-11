package com.zhaozs.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/5/7
 * @ 描述
 */
public class MyAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

    }
}
