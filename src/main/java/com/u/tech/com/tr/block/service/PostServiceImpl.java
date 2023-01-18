package com.u.tech.com.tr.block.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.u.tech.com.tr.block.dao.PostRepository;
import com.u.tech.com.tr.block.entity.Post;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepo;

    @Override
    public List<Post> getPost() {
        return postRepo.findAll();
    }

    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public Post findById(Integer id) {
        Optional<Post> postResult = postRepo.findById(id);
        Post post = null;
        if (postResult.isPresent()) {
            post = postResult.get();
        }
        return post;
    }

    @Override
    public void delete(Post post) {
        postRepo.delete(post);
    }
}