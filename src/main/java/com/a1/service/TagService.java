package com.a1.service;

import java.util.List;

import com.a1.sinzi.bean.Tag;

public interface TagService {

	//태그 조회
	List<Tag> getTagList() throws Exception;
		
	//태그 등록
	public void insertTag(Tag tag) throws Exception;
		
	//태그 수정
	public void updateTag(Tag tag) throws Exception;
		
	//태그 삭제
	public void deleteTag(Integer tag_no) throws Exception;

}
