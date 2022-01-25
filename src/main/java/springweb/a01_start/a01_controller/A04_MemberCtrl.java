package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// springweb.a01_start.a01_controller.A04_MemberCtrl
// 컨테이너에 등록합니다.
@Controller
public class A04_MemberCtrl {
	// 요청 url 호출
	// 1. 초기 화면 호출
	@RequestMapping("/loginFrm.do")
	public String loginFrm() {
		return "WEB-INF\\views\\a06_login.jsp";
	}
	// 2. 요청값 처리화면 호출. login.od?id=@@@&pass=@@@
	@RequestMapping("/login.do")
	public String login(@RequestParam("id") String id,
						@RequestParam("pass") String pass, Model d) {
		System.out.println("# 로그인 #");
		System.out.println("id:"+id);
		System.out.println("pass:"+pass);
		String result = (id.equals("himan")&&pass.equals("7777"))?"로그인성공":"로그인실패";
		System.out.println("결과:"+result);
		d.addAttribute("result", result);
		return "WEB-INF\\views\\a06_login.jsp";
	}
	
}
