package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class A02_StartExp {
	
//	springweb.a01_start.a01_controller.A02_StartExp
	// a02_secondView.jsp
	// http://localhost:7080/springweb/start2.do?name=홍길동
	// @RequestParam("name") 정의되어 있을 때는 반드시 해당 요청값을 넘겨줘야 된다.
	@RequestMapping("/start2.do")
	public String start2(@RequestParam("name") String name, Model d) {
		d.addAttribute("m01", "모델명:"+name);
		
		return "WEB-INF\\views\\a02_secondView.jsp";
	}
}
