package com.knight.auth.service;


import com.knight.auth.domain.ResponseResult;
import com.knight.auth.domain.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();

}
