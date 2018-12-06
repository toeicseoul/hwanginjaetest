package kr.or.kosta.mvc.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.or.kosta.dto.ExampSawonDTO;

@Controller
public class ModelAttrDemo {

	// 자바에서 지원하는 logger객체 사용하기
	private static final Logger LOGGER = Logger.getLogger(ParameterDemo.class.getName());

	@PostMapping("/formTest")
	public String paramDto(@ModelAttribute(value="dto") ExampSawonDTO dto) {
		System.out.println("test " + dto.getDeptno());
		LOGGER.info("writer : " + dto.getWriter());
		LOGGER.info("deptno : " + dto.getDeptno());
		LOGGER.info("Blog : " + dto.getUrl());
		
		//m.addAttribute("writer", dto.getWriter());
		//m.addAttribute("deptno", dto.getDeptno());
		//m.addAttribute("url", dto.getUrl());
		return "msgDto";
	}

	@GetMapping("/modelForm")
	public String form() {
		return "form2";
	}

}
