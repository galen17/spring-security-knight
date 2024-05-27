package com.knight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author knight
 * @Date 2024/5/27 18:32
 */
@SpringBootApplication
public class SecurityBaseApplication {
    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(SecurityBaseApplication.class, args);
        System.out.println(112233);
    }
}
