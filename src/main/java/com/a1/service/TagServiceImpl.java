package com.a1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.a1.sinzi.bean.Tag;
import com.a1.sinzi.dao.TagDAO;

public class TagServiceImpl implements TagService {

	@Autowired
	TagDAO tagDAO;

	//태그 조회
	public List<Tag> getTagList() throws Exception {
		return tagDAO.getTagList();
	}
	
	@Transactional
	//태그 등록
	public void insertTag(Tag tag) throws Exception {
		tagDAO.insertTag(tag);
	}
	
	@Transactional
	//태그 수정
	public void updateTag(Tag tag) throws Exception {
		tagDAO.updateTag(tag);
	}
	
	@Transactional
	//태그 삭제
	public void deleteTag(Integer tag_no) throws Exception {
		tagDAO.deleteTag(tag_no);
	}
}
