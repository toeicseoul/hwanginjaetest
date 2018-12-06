package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//DispatcherServlet 요청에 응답하는 모델
//RequestMapping ==> HandlerMapping

//Controller 어노테이션 필수!
@Controller
public class HelloController {

//	public ModelAndView myHello() {
//			
//	}
	// ModelAndView, View 반환
	@RequestMapping(value = "/")
	public String myHello() {
		return "index"; //view의 이름을 반환
	}
}
