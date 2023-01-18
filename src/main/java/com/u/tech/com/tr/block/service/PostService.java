package com.u.tech.com.tr.block.service;

import java.util.List;
import com.u.tech.com.tr.block.entity.Post;

public interface PostService {
	public List<Post> getPost();
	public void save(Post post);
	public Post findById(Integer id);
	public void delete(Post post);
}
