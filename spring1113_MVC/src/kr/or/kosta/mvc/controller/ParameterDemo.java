package kr.or.kosta.mvc.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.dto.ExampSawonDTO;

@Controller
public class ParameterDemo {

	

//	@RequestMapping(value = "/param1", params = "code=A")
//	public String paramDemo1(Model m, String code) {
//
//		m.addAttribute("msg", code);
//		return "msg";
//	}
//
//	@RequestMapping(value = "/param1", params = "code=B")
//	public String paramDemo2(Model m, String code) {
//		m.addAttribute("msg", code);
//		return "msg";
//	}
//
//	// ��û �Ķ���Ͱ� test�� �ƴ� �͸�
//	@RequestMapping(value = "/param2", params = "code!=test")
//	public String paramDemo3(Model m, String code) {
//		m.addAttribute("msg", code);
//		return "msg";
//	}

	@RequestMapping(value = "/param1", params = "code=A")
	public ModelAndView paramDemo1(String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", code);
		return m;
	}

	@RequestMapping(value = "/param1", params = "code=B")
	public ModelAndView paramDemo2(String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", code);
		return m;
	}

	// * kr.or.kosta.mvc.controller.*.noparam*(..)
	@RequestMapping(value = "/param1")
	public ModelAndView noparamDemo3(String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", code);
		return m;
	}

	// ��û �Ķ���Ͱ� test�� �ƴ� �͸�
	@RequestMapping(value = "/param2", params = "mycode!=test")
	public ModelAndView paramDemo3(String mycode) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", mycode);
		return m;
	}

	// error2.jsp���� ���� �޼����� ����Ͻÿ�
	@GetMapping("/exceptionDemo")
	public String exceptionDemo() {
		String[] list = { "test", "test1", "test3" };
		String res = "";
		for (int i = 0; i <= list.length; i++) {
			res = list[i];
		}
		return "msg";
	}

	@GetMapping("/intDemo")
	public String paramInt(Model m, int num) {
		int res = num + 100;
		m.addAttribute("msg", res);
		return "msg";
	}

	// @RequestParam(value="id", required=false, default="ww)aZ
	// @RequestParam(value="id", required=false, defaultValue="test")
	// @RequestParam(value="id") �Ķ���� ���� ������ �� �ִ� ���
	// �⺻���� required=true �̱� ������ �Ķ���Ͱ� ���� ���
	// MissingServletRequestParameterException�� �߻��Ѵ�.
	// required=false : �Ķ���� ���� ���� ���ܰ� �߻����� �ʴ´�.
	// id���� ������ id ���� ������
	// �ƹ� ���� �Է����� ������ default���� ���´�.

	// defaultValue="" �Ķ���Ͱ��� ���� �� �⺻������ ����

	@RequestMapping(value = "/param3")
	public ModelAndView paramDemo5(
			@RequestParam(value = "id", required = false, defaultValue = "defaultTest") String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", code);
		return m;
	}

	

}
