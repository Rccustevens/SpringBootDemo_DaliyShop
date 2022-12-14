package com.edu.bcu.springbootdemo.dao;

import com.edu.bcu.springbootdemo.domain.TUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into t_user(user_name,password,role,address,phone)" + "values(#{user_name},#{password},#{role},#{address},#{phone})")
    public int addOne(TUser tUser);

    @Select("select count(*) from t_user where user_name=#{user_name}" + "and password=#{password}")
    public int findOne(String user_name,String password);

}
