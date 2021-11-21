package org.zerock.image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webjjang.util.PageObject;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/image")
@Log4j
public class ImageController {

	private final String MODULE = "image";
	
	// 리스트
	@GetMapping("/list.do")
	public String list(PageObject pageObject, Model model) {
		return MODULE + "/list";
	}
	// 보기
	// 등록 폼
	// 등록 처리
	// 수정 폼
	// 수정 처리
	// 삭제
	
}
