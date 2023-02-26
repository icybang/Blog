package com.app.service;

import java.util.List;

import com.app.entities.Post;
import com.app.payloads.PostDto;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	Post updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);

	// get all post
	List<Post> getAllPost();

	// get single post
	Post getPostById(Integer postId);

	// get all post by category
	List<Post> getPostByCategory(Integer categoryId);

	// get all posts by user
	List<Post> getPostByUser(Integer userId);

	// search posts
	List<Post> searchPosts(String keyword);

}
