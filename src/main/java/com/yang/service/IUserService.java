package com.yang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.dto.LoginFormDTO;
import com.yang.dto.Result;
import com.yang.entity.User;

import javax.servlet.http.HttpSession;

public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
