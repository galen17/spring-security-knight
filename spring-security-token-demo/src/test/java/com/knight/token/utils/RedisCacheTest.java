package com.knight.token.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author knight
 * @Date 2024/5/29 15:13
 */
@SpringBootTest
class RedisCacheTest {

    @Autowired
    private RedisCache redisCache;

    @Test
    void setCacheObject() {
        redisCache.setCacheObject("key2", "xiaoming2");

    }

    @Test
    void testSetCacheObject() {
    }
}