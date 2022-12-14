package com.edu.bcu.springbootdemo.controller;

import com.edu.bcu.springbootdemo.domain.Category;
import com.edu.bcu.springbootdemo.domain.CategoryBO;
import com.edu.bcu.springbootdemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes(names = {"USER_NAME_SESSION"},types = {String.class})
public class IndexController {
    private final CategoryService categoryService;

    @Autowired
    public IndexController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/index")
    public String showIndexView(Model model) {
        if (model.containsAttribute("USER_NAME_SESSION")) {

            List<Category> firstCategorysList = new ArrayList<Category>();
            List<CategoryBO> allCategorysList = new ArrayList<CategoryBO>();
            firstCategorysList = this.categoryService.getAllFirstCategorys();
            model.addAttribute("firstCategorysList", firstCategorysList);
            model.addAttribute("allCategorysList", allCategorysList);


            return "index";
        } else {
            return "login";
        }

//        return "index";
    }

}
