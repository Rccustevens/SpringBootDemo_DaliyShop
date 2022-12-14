package com.edu.bcu.springbootdemo.service;

import com.edu.bcu.springbootdemo.domain.TUser;

public interface UserService {

    boolean register(TUser tUser);

    boolean login(String user_name, String password);
}
