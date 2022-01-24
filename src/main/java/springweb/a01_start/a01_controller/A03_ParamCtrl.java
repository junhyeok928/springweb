package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// springweb.a01_start.a01_controller.A03_ParamCtrl
@Controller
public class A03_ParamCtrl {
	// http://localhost:7080/springweb/gogo3.do?name=홍길동
	@RequestMapping("/gogo3.do")
	public String gogo34(@RequestParam("name") String name) {
		System.out.println("요청된 이름"+name);
		return "";
	}
	// ex) http://localhost:7080/springweb/gogo4.do?age=25
	@RequestMapping("/gogo4.do")
	public String ex1(@RequestParam("age") String age) {
		System.out.println("요청된 나이"+age);
		return "";
	}
	// ex) http://localhost:7080/springweb/gogo6.do
	@RequestMapping("/gogo6.do")
	public String gogo6() {
		return "WEB-INF\\views\\a05_gogo.jsp";
	}
	// ex) http://localhost:7080/springweb/gogo5.do?num01=25&num02=30&cal=덧셈
	@RequestMapping("/gogo5.do")
	public String ex2(@RequestParam("num01") int num01,
			@RequestParam("num02") int num02,
			@RequestParam("cal") String cal) {
		System.out.println("num01="+num01);
		System.out.println("num02="+num02);
		System.out.println("cal="+cal);
		return "WEB-INF\\views\\a05_gogo.jsp";
	}

}
