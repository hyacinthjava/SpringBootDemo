package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hyaci
 * 项目启动类要添加注解@MapperScan项目启动时扫描mapper接口，否则会报错找不到mapper文件
 * Application 项目启动文件 项目启动地址 Application
 */
@SpringBootApplication
@MapperScan("com.example.springboot.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
