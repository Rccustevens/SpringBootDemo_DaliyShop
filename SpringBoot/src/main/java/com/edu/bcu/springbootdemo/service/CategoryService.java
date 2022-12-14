package com.edu.bcu.springbootdemo.service;

import com.edu.bcu.springbootdemo.domain.Category;
import com.edu.bcu.springbootdemo.domain.CategoryBO;

import java.util.List;

public interface CategoryService {
    List<Category> getAllFirstCategorys();

    List<CategoryBO> getAllCategorys();
}
