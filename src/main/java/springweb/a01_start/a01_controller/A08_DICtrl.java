package springweb.a01_start.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import springweb.a01_start.a02_service.A08_DIService;

@Controller
public class A08_DICtrl {
	// 서비스단 호출.
	@Autowired
	private A08_DIService service;
	
	@GetMapping("/call08.do")
	public String call08(Model d) {
		d.addAttribute("call08", service.call08());
		return "WEB-INF\\views\\a08_diexp.jsp";
	}
}
