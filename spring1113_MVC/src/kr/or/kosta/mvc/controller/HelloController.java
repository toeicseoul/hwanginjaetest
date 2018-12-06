package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//DispatcherServlet ��û�� �����ϴ� ��
//RequestMapping ==> HandlerMapping

//Controller ������̼� �ʼ�!
@Controller
public class HelloController {

//	public ModelAndView myHello() {
//			
//	}
	// ModelAndView, View ��ȯ
	@RequestMapping(value = "/")
	public String myHello() {
		return "index"; //view�� �̸��� ��ȯ
	}
}
