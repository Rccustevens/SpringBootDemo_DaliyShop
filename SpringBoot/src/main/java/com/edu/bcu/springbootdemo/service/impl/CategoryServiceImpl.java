package com.edu.bcu.springbootdemo.service.impl;

import java.util.List;
import com.edu.bcu.springbootdemo.dao.CategoryMapper;
import com.edu.bcu.springbootdemo.domain.Category;
import com.edu.bcu.springbootdemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<Category> getAllFirstCategorys() {
        return this.categoryMapper.findAllFirst();
    }
}

