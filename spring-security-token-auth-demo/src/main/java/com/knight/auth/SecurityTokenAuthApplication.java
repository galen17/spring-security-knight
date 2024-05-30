package com.knight.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author knight
 * @Date 2024/5/29 18:26
 */
@SpringBootApplication
@MapperScan("com.knight.auth.mapper")
public class SecurityTokenAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityTokenAuthApplication.class,args);
    }
}
