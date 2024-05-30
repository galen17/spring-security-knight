package com.knight.token.service;


import com.knight.token.domain.ResponseResult;
import com.knight.token.domain.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();

}
