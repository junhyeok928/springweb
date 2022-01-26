package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import springweb.vo.Calculator;
import springweb.vo.Member;

// springweb.a01_start.a01_controller.A06_ModelAttributeCtrl
@Controller
public class A06_ModelAttributeCtrl {
	
	/*
	# form의 속성인 method의 속성값 get/post에 따른 명시적인 기능메서드 호출 방법
	1. RequestMapping 둘다 처리가 된다.
	 * */
	// url주소에 요청값을 넘기거나, 입력 값이 없을 때, 초기화면을 로딩할 때, 주로 사용된다.
	@GetMapping("/getCall.do")
	public String getCall() {
		System.out.println("get방식으로 초기 화면 호출");
		return "WEB-INF\\views\\a07_method_post.jsp";
	}
	// get/post방식을 명식화 할때는 url이 동일하더라도 선언이 가능하다.
	// 두개는 구분되는 호출 형식 method="get/post"로 식별되기 때문이다.
	@PostMapping("/getCall.do")
	public String getCall2() {
		System.out.println("post방식으로 초기 화면 호출");
		return "WEB-INF\\views\\a07_method_post.jsp";
	}	
	// ex) login22.do 로 get방식과 post 방식으로 선언하여.
	//     화면이 로딩 및 요청값이 처리되게 하세요..
	//     5조 제출, 손들기..
	@GetMapping("/login22.do")
	public String loginFrm() {
		System.out.println("get방식 login22.do");
		return "WEB-INF\\views\\a08_loginFrm.jsp";
	}
	@PostMapping("/login22.do")
	public String login(@ModelAttribute("mem") Member mem) {
		System.out.println("post방식 login22.do");
		System.out.println("로그인");
		System.out.println("아이디:"+mem.getId());
		System.out.println("패스워드:"+mem.getPass());
		
		return "WEB-INF\\views\\a08_loginFrm.jsp";
	}
	@GetMapping("/calcu.do")
	public String calcu() {
		return "WEB-INF\\views\\a09_calculator.jsp";
	}
	@PostMapping("/calcu.do")
	public String calcu2(Calculator cal) {
		System.out.println("# post 방식 #");
		System.out.println(cal.getNum01());
		System.out.println(cal.getNum02());
		return "WEB-INF\\views\\a09_calculator.jsp";
	}
	
}
