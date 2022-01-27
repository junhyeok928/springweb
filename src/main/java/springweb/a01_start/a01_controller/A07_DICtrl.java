package springweb.a01_start.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springweb.a01_start.a02_service.A02_DIService;

@Controller
public class A07_DICtrl {
	@Autowired
	private A02_DIService service;
	
	@GetMapping("/call05.do")
	public String call05() {
		service.show();
		return "";
	}
}
