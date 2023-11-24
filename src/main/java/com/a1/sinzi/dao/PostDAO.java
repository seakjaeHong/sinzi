package com.a1.sinzi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.a1.sinzi.bean.Post;

@Mapper
@Repository
public interface PostDAO {

	//게시물 조회
	public List<Post> getPostList() throws Exception;
	
	//게시물 등록
	public void insertPost(Post post) throws Exception;
	
	//게시물 수정
	public void updatePost(Post post) throws Exception;
	
	//게시물 삭제
	public void deletePost(Post post) throws Exception;
	
	
}
