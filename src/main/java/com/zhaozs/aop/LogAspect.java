package com.zhaozs.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/5/7
 * @ 描述
 */

public class LogAspect {

    private Logger log = LoggerFactory.getLogger(LogAspect.class);
    /**
     * 定义切点
     */
    @Pointcut("execution(public * com.zhaozs.service.*.*(..))")
    public void logAspect() {
        System.out.println("------------------------ 中华人民共和国------------------------");
    }

    /**
     * 前置通知，在连接点之前执行的通知
     */
    @Before("logAspect()")
    public void doBefore() {

        // 接受到请求，记录请求内容
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        // 记录内容
        log.info("url:           " + request.getRequestURI().toString());
        log.info("http_method:   " + request.getMethod());
        log.info("ip:            " + request.getRemoteAddr());
    }

    @AfterReturning(returning = "ret", pointcut = "LogAspect()")
    public void doAfter(Object ret)throws Throwable {

        // 处理完请求，返回内容
        log.info("RESPONSE:" + ret);
    }



}
