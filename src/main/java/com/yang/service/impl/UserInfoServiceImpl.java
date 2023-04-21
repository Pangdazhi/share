package com.yang.service.impl;

import com.yang.entity.UserInfo;
import com.yang.mapper.UserInfoMapper;
import com.yang.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
