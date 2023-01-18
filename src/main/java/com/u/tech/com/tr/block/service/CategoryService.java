package com.u.tech.com.tr.block.service;

import com.u.tech.com.tr.block.entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getCategory();
    public void save(Category category);
    public Category findById(Integer id);
    public void delete(Category category);
}
