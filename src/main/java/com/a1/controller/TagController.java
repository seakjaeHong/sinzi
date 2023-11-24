package com.a1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.a1.service.TagService;
import com.a1.sinzi.bean.Tag;

@Controller
public class TagController {

	@Autowired
	TagService tagService;
	
	//태그 조회
	@GetMapping(value = "/tag/tagList")
	public ModelAndView tagList() {
		ModelAndView mav = new ModelAndView();
		try {
			List<Tag> tagList = tagService.getTagList();
			mav.addObject("tagList", tagList);
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("태그가 존재하지 않습니다.");
			mav.addObject("err", e.getMessage());
		}
		return mav;
	}
	
	//태그 생성
	@GetMapping(value = "/tag/write")
	public ModelAndView tagWrite(@RequestBody Tag tag) {
		ModelAndView mav = new ModelAndView();
		try {
			tagService.insertTag(tag);
			mav.setViewName("redirect:/tag/tagList");
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("태그를 생성 할 수 없습니다.");
			mav.addObject("err", e.getMessage());
		}
		return mav;
	}
	
	//태그 수정
	@GetMapping(value = "/tag/modify")
	public ModelAndView tagModify(@RequestBody Tag tag) {
		ModelAndView mav = new ModelAndView();
		try {
			tagService.updateTag(tag);
			mav.setViewName("redirect:/tag/tagList");
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("태그를 수정할 수 없습니다..");
			mav.addObject("err", e.getMessage());
		}
		return mav;
	}
	
	//태그 삭제
	@GetMapping(value = "/tag/delete")
	public ModelAndView tagDelete(@RequestBody Integer tag_no){
		ModelAndView mav = new ModelAndView();
		try {
			tagService.deleteTag(tag_no);
			mav.setViewName("redirect:/tag/tagList");
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("태그를 삭제할 수 없습니다.");
			mav.addObject("err", e.getMessage());
		}
		return mav;
	}
}
