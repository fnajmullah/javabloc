package com.u.tech.com.tr.block.service;

import com.u.tech.com.tr.block.dao.CategoryRepository;
import com.u.tech.com.tr.block.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category findById(Integer id) {
        Optional<Category> categoryResult = categoryRepository.findById(id);
        Category category = null;
        if (categoryResult.isPresent()) {
            category = categoryResult.get();
        }
        return category;
    }

    @Override
    public void delete(Category category) {
        categoryRepository.delete(category);
    }
}
