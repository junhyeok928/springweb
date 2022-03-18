package springweb.a02_mvc.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class A11_ChattingController {
	// http://localhost:7080/springweb/chatting.do
	@GetMapping("chatting.do")
	public String chatting() {
		
		return "WEB-INF\\views\\a02_mvc\\a11_chatting.jsp";
	}
}
