package com.u.tech.com.tr.block.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.u.tech.com.tr.block.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
