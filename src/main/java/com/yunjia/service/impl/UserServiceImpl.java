package com.yunjia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yunjia.bean.User;
import com.yunjia.mapper.UserMapper;
import com.yunjia.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ServiceImpl<UserMapper, User> 第一个参数是需要操作的表对应的Mapper，第二个参数表示返回的类型
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}