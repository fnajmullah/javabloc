package com.u.tech.com.tr.block.controller;


import com.u.tech.com.tr.block.entity.Category;
import com.u.tech.com.tr.block.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getCategory() {
        return categoryService.getCategory();
    }

    @PostMapping("/save")
    public Category saveCategory(@RequestBody Category category) {
        categoryService.save(category);
        return category;
    }
    @GetMapping("/category/{id}")
    public Category getCategoryById(@PathVariable Integer id) {
        Category category= categoryService.findById(id);
        return category;
    }

    @DeleteMapping("/delete/{id}")
    public Category deleteCategory(@PathVariable Integer id) {
        Category category = categoryService.findById(id);
        categoryService.delete(category);
        return category;
    }

    @PutMapping("/update/{id}")
    public Category updateCategory(@PathVariable Integer id, @RequestBody Category categoryDetail) {
        Category category = categoryService.findById(id);
        category.setPid(categoryDetail.getPid());
        category.setName(categoryDetail.getName());
        category.setDescription(categoryDetail.getDescription());
        category.setUpdatedAt(LocalDate.now().toString());
        categoryService.save(category);
        return category;
    }
}
