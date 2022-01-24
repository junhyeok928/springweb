package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// springweb.a01_start.a01_controller.A01_StartController
@Controller
public class A01_StartController {
	// http://localhost:7080/springweb/start.do
	@RequestMapping("/start.do")
	public String start() {
		return "WEB-INF\\views\\a01_springStart.jsp";
	}
	
	// ex) http://localhost:7080/springweb/gogo.do
	//	호출시 화면을 로딩되게 처리하세요
	@RequestMapping("/gogo.do")
	public String start3() {
		return "WEB-INF\\views\\a03_show.jsp";
		// return ""; view단 호출 부분.. view의 소스(jsp)
		// 의 기준경오린 springweb\src\main\webapp
		// 이 후의 경로와 파일명을 적어준다.
	}
}
