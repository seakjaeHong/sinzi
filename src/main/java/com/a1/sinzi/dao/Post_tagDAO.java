package com.a1.sinzi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.a1.sinzi.bean.Post_tag;

@Mapper
@Repository
public interface Post_tagDAO {

	//게시물 태그 조회
	public List<Post_tag> getPost_tagList() throws Exception;
	
	//게시물 태그 등록
	public void insertPost_tag(Post_tag post_tag) throws Exception;
	
	//게시물 태그 수정
	public void updatePost_tag(Post_tag post_tag) throws Exception;
	
	//게시물 태그 삭제
	public void deletePost_tag(Integer board_tag_id) throws Exception;
	
	
}
