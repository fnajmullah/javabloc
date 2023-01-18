package com.u.tech.com.tr.block.dao;

import com.u.tech.com.tr.block.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
