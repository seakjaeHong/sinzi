package com.a1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.a1.service.PostService;
import com.a1.sinzi.bean.Post;

@Controller
public class PostController {

	@Autowired
	PostService postService;
	
	//게시물 조회
	@GetMapping(value = "/post/postList")
	public ModelAndView postList() {
		ModelAndView mav = new ModelAndView();
		try {
			List<Post> postList = postService.getPostList();
			mav.addObject("postList", postList);
			
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("게시물이 존재하지 않습니다.");
			mav.addObject("err", e.getMessage());
		}
		return mav;
	}
	
	//게시물 생성
	@GetMapping(value = "/post/write")
	public ModelAndView postWrite(@RequestBody Post post) {
		ModelAndView mav = new ModelAndView();
		try {
			postService.insertPost(post);
			mav.setViewName("redirect:/post/postList");
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("게시물을 생성할 수 없습니다.");
			mav.addObject("err", e.getMessage());		
			}
		return mav;
	}
	
	//게시물 수정
	@GetMapping(value = "/post/modify")
	public ModelAndView postModify(@RequestBody Post post) {
		ModelAndView mav = new ModelAndView();
		try {
			postService.updatePost(post);
			mav.setViewName("redirect:/post/postList");
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("게시물을 수정할 수 없습니다.");
			mav.addObject("err", e.getMessage());		
			}
		return mav;
	}
	
	//게시물 삭제
	@GetMapping(value = "/post/delete")
	public ModelAndView postDelete(@RequestBody Post post){
		ModelAndView mav = new ModelAndView();
		try {
			postService.deletePost(post);
			mav.setViewName("redirect:/post/postList");
		}catch (Exception e) {
			//로그 미사용으로 콘솔 출력으로 대체
			System.err.println("게시물을 삭제할 수 없습니다.");
			mav.addObject("err", e.getMessage());
		}
		return mav;

	}
}