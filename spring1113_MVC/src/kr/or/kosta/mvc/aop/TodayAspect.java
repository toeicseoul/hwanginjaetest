package kr.or.kosta.mvc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
@Aspect
public class TodayAspect {

	@AfterReturning(pointcut = 
			"execution(* kr.or.kosta.mvc.controller.*.noparam*(..))", returning = "msg")
	public void after(JoinPoint jp, Object msg) {
		ModelAndView m = (ModelAndView) msg;
		m.setViewName("msg2");
	}

}
