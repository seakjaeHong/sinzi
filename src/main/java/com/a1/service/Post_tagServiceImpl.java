package com.a1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.a1.sinzi.bean.Post_tag;
import com.a1.sinzi.dao.Post_tagDAO;

public class Post_tagServiceImpl implements Post_tagService {

	@Autowired
	Post_tagDAO post_tagDAO;
	
	//게시물 태그 조회
	public List<Post_tag> getPost_tagList() throws Exception {
		return post_tagDAO.getPost_tagList();	
	}
	
	//게시물 태그 등록
	@Transactional
	public void insertPost_tag(Post_tag post_tag) throws Exception {
		post_tagDAO.insertPost_tag(post_tag);
	}
	
	//게시물 태그 수정
	@Transactional
	public void updatePost_tag(Post_tag post_tag) throws Exception {
		post_tagDAO.updatePost_tag(post_tag);	
	}
	
	//게시물 태그 삭제
	@Transactional
	public void deletePost_tag(Integer board_tag_id) throws Exception {
		post_tagDAO.deletePost_tag(board_tag_id);
	}
}
