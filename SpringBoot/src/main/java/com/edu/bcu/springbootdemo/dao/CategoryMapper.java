package com.edu.bcu.springbootdemo.dao;

import com.edu.bcu.springbootdemo.domain.Category;
import com.edu.bcu.springbootdemo.domain.CategoryBO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface CategoryMapper {

//    查询所有一级分类
    @Select("select * from category where status = 0")
    public List<Category> findAllFirst();

//    查询所有一级分类和二级分类
    @Select("select * from category where status = 0")
    @Results({
           @Result(column ="categoryId",property = "secondCategoryList",
                   many = @Many(select = "com.edu.bcu.springbootdemo.dao.CategoryMapper.findAllSecondById",fetchType = FetchType.EAGER)),

    })
    public List<CategoryBO> findAll();

//    查询某一个一级分类下的所有二级分类
    @Select("select * from category where dependId = #{categoryId}")
    public List<CategoryBO> findAllSecondById(int categoryId);
}
