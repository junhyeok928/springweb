package springweb.a01_start.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a01_start.a02_service.A01_StartService;
// springweb.a01_start.a01_controller.A01_StartController
@Controller
public class A01_StartController {
	// http://localhost:7080/springweb/start.do
	@Autowired
	private A01_StartService service;
	// 객체에서 메서드를 쓸려면 객체를 생성하고, 메서드를 활용하여야 한다.
	// service.call() 사용하고 있다
	@RequestMapping("/start.do")
	public String start(Model d) {
		d.addAttribute("service", service.call());
		// ${service} : service.call()에서 나오는 문자열이 출력된다.
		//				"서비스 메서드 호출"
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
