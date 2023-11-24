package com.a1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.a1.service.Post_tagService;
import com.a1.sinzi.bean.Post_tag;

@Controller
public class Post_tagController {

	@Autowired
	Post_tagService post_tagService;
	
	//게시물 태그 조회
	@GetMapping(value = "/post_tag/post_tagList")
	public ModelAndView post_tagList() {
		ModelAndView mav = new ModelAndView();
		try {
			List<Post_tag> post_tagList = post_tagService.getPost_tagList();
			mav.addObject("post_tagList", post_tagList);
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("게시물 태그가 존재하지 않습니다.");
			mav.addObject("err", e.getMessage());
		}
		return mav;
	}
	
	//게시물 태그 생성
	@GetMapping(value = "/post_tag/write")
	public ModelAndView post_tagWrite(@RequestBody Post_tag post_tag) {
		ModelAndView mav = new ModelAndView();
		try {
			post_tagService.insertPost_tag(post_tag);
			mav.setViewName("redirect:/post_tag/post_tagList");
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("게시물 태그를 생성할 수 없습니다.");
			mav.addObject("err", e.getMessage());		
		}
		return mav;
	}
	
	//게시물 태그 수정
	@GetMapping(value = "/post_tag/modify")
	public ModelAndView post_tagModify(@RequestBody Post_tag post_tag) {
		ModelAndView mav = new ModelAndView();
		try {
			post_tagService.updatePost_tag(post_tag);
			mav.setViewName("redirect:/post_tag/post_tagList");
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("게시물 태그를 수정할 수 없습니다..");
			mav.addObject("err", e.getMessage());		
		}
		return mav;
	}
	
	//게시글 태그 삭제
	@GetMapping(value = "/post_tag/delete")
	public ModelAndView post_tagDelete(@RequestBody Integer board_tag_id){
		ModelAndView mav = new ModelAndView();
		try {
			post_tagService.deletePost_tag(board_tag_id);
			mav.setViewName("redirect:/post_tag/post_tagList");
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("게시물 태그를 삭제할 수 없습니다.");
			mav.addObject("err", e.getMessage());
		}
		return mav;
	}
}