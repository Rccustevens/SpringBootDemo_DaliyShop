package com.edu.bcu.springbootdemo.service.impl;

import com.edu.bcu.springbootdemo.dao.UserMapper;
import com.edu.bcu.springbootdemo.domain.TUser;
import com.edu.bcu.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public boolean register(TUser tUser){
        System.out.println(tUser);
        int result = this.userMapper.addOne(tUser);
        if(result==0){
            return false;
        }else {
//            注册成功
            return true;
        }
    }

    @Override
    public boolean login(String user_name, String password){
        int result=this.userMapper.findOne(user_name,password);
        return result != 0;
    }
}
