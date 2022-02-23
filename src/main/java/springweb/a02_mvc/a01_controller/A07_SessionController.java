package springweb.a02_mvc.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import springweb.vo.Member;

@Controller
@SessionAttributes("member")
public class A07_SessionController {
	// 사용할 session 모델을 선언.
	@ModelAttribute("member")
	public Member getMember() {
		return new Member();
	}
	// 로그인을 통해 세션값 설정.
	// http://localhost:7080/springweb/loginFrm10.do
	@GetMapping("/loginFrm10.do")
	public String login() {
		
		return "\\WEB-INF\\views\\a10_sessLogin.jsp";	
	}	
	// 로그인을 통해 세션값 설정.
	@PostMapping("/login10.do")
	public String  login10(@ModelAttribute("member") Member m, Model d){
		String page="\\WEB-INF\\views\\a10_sessLogin.jsp";
		if(m.getId().equals("himan")&&m.getPass().equals("7777")){
			m.setName("홍길동"); m.setAuth("admin");  m.setPoint(10000);
			d.addAttribute("msg","로그인 성공");
			page="\\WEB-INF\\views\\a11_main.jsp";
		}else{
			d.addAttribute("msg","로그인 실패");
		}
		return page;		
	}	

}
