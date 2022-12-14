package com.edu.bcu.springbootdemo.domain;

import java.util.List;

public class CategoryBO {
    private Integer categoryId;
    private Integer status;
    private Integer dependId;
    private String categoryName;

//    一级分类下的二级分类
    private List<Category> secondCategoryList;


    public CategoryBO() {
    }

    public CategoryBO(Integer categoryId, Integer status, Integer dependId, String categoryName, List<Category> secondCategoryList) {
        this.categoryId = categoryId;
        this.status = status;
        this.dependId = dependId;
        this.categoryName = categoryName;
        this.secondCategoryList = secondCategoryList;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDependId() {
        return dependId;
    }

    public void setDependId(Integer dependId) {
        this.dependId = dependId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Category> getSecondCategoryList() {
        return secondCategoryList;
    }

    public void setSecondCategoryList(List<Category> secondCategoryList) {
        this.secondCategoryList = secondCategoryList;
    }
}
