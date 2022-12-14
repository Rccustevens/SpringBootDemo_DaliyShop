package com.edu.bcu.springbootdemo.domain;

//create 领域模型
public class Category {
    private Integer categoryId;
    private Integer status;
    private Integer dependId;
    private String categoryName;

    public Category() {
    }

    public Category(Integer categoryId, Integer status, Integer dependId, String categoryName) {
        this.categoryId = categoryId;
        this.status = status;
        this.dependId = dependId;
        this.categoryName = categoryName;
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

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", status=" + status +
                ", dependId=" + dependId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
