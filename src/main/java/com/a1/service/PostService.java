package com.a1.service;

import java.util.List;

import com.a1.sinzi.bean.Post;

public interface PostService {

	//게시물 조회
	List<Post> getPostList() throws Exception;
	
	//게시물 등록
	public void insertPost(Post post) throws Exception;
	
	//게시물 수정
	public void updatePost(Post post) throws Exception;
	
	//게시물 삭제
	public void deletePost(Post post) throws Exception;
	
}
