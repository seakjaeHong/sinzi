package com.a1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.a1.sinzi.bean.Post;
import com.a1.sinzi.dao.PostDAO;

public class PostServiceImpl implements PostService {

	@Autowired
	PostDAO postDAO;
	
	//게시물 조회
	public List<Post> getPostList() throws Exception {
		return postDAO.getPostList();	
	}
	
	//게시물 등록
	@Transactional
	public void insertPost(Post post) throws Exception {
		postDAO.insertPost(post);
	}
	
	//게시물 수정
	@Transactional
	public void updatePost(Post post) throws Exception {
		postDAO.updatePost(post);	
	}
	
	//게시물 삭제
	@Transactional
	public void deletePost(Post post) throws Exception {
		postDAO.deletePost(post);
	}

}
