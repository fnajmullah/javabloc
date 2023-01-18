package com.u.tech.com.tr.block.controller;

import java.util.List;
import java.time.LocalDate;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.u.tech.com.tr.block.entity.Post;
import com.u.tech.com.tr.block.service.PostService;


@RestController
@RequestMapping("/api/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public List<Post> getPost() {
        return postService.getPost();
    }

    @PostMapping("/save")
    public Post savePost(@RequestBody Post post) {
        postService.save(post);
        return post;
    }
    @GetMapping("/get/{id}")
    public Post getPostById(@PathVariable Integer id) {
        Post post= postService.findById(id);
        return post;
    }

    @DeleteMapping("/delete/{id}")
    public Post deletePost(@PathVariable Integer id) {
        Post post = postService.findById(id);
        postService.delete(post);
        return post;
    }

    @PutMapping("/update/{id}")
    public Post updatePost(@PathVariable Integer id, @RequestBody Post postDetail) {
        Post post = postService.findById(id);
       post.setUid(postDetail.getUid());
       post.setTitle(postDetail.getTitle());
       post.setDescription(postDetail.getDescription());
       post.setCategoryid(postDetail.getCategoryid());
       post.setCountviews(postDetail.getCountviews());
       post.setUpdatedAt(LocalDate.now().toString());
       postService.save(post);
        return post;
    }
}