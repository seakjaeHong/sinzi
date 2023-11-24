package com.a1.service;

import java.util.List;

import com.a1.sinzi.bean.Post_tag;

public interface Post_tagService {

	
	//게시물 태그 조회
	List<Post_tag> getPost_tagList() throws Exception;
		
	//게시물 태그 등록
	public void insertPost_tag(Post_tag post_tag) throws Exception;
		
	//게시물 태그 수정
	public void updatePost_tag(Post_tag post_tag) throws Exception;
		
	//게시물 태그 삭제
	public void deletePost_tag(Integer post_no) throws Exception;
		
}
