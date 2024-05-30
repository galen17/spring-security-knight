package com.knight.token;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author knight
 * @Date 2024/5/28 14:36
 */
@SpringBootApplication
@MapperScan("com.knight.token.mapper")
public class SecurityTokenApplication {
    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(SecurityTokenApplication.class, args);
    }
}
