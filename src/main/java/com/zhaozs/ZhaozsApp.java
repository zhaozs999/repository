package com.zhaozs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.zhaozs.dao")
public class ZhaozsApp {
    public static void main( String[] args ) {
        SpringApplication.run(ZhaozsApp.class, args);
        System.out.println( "启动成功!=======================" );
    }
}
