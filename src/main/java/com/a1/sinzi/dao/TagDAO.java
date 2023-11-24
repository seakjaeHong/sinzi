package com.a1.sinzi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.a1.sinzi.bean.Tag;

@Mapper
@Repository
public interface TagDAO {

	//태그 조회
	public List<Tag> getTagList() throws Exception;
	
	//태그 등록
	public void insertTag(Tag tag) throws Exception;
	
	//태그 수정
	public void updateTag(Tag tag) throws Exception;
	
	//태그 삭제
	public void deleteTag(Integer tag_no) throws Exception;
	
	
}
