package com.edu.bcu.springbootdemo.dao;

import com.edu.bcu.springbootdemo.domain.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Select("select * from category where status = 0")
    public List<Category> findAllFirst();
}
