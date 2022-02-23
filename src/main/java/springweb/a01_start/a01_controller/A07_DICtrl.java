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
//ex) A08_DICtrl.java 만들고, A08_DIService를 autowiring하여 
// 			//call08.do  호출하여 출력되게 처리하세요.

//    A08_DIService.java 만들어서 기능메서드 call08() 선언..
//      5조 제출, 손들기.






