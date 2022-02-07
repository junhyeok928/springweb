package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a02_mvc.a02_service.A01_EmpService;
import springweb.vo.Emp;



@Controller
public class A01_EmpController {

	@Autowired
	private A01_EmpService service;
	
	// http://localhost:7080/springweb/empList.do
	@RequestMapping("/empList.do")
	public String empList(Emp sch, Model d) {
		// service 객체에서 넘겨온 ArrayList<Emp>객체를 emplist라는
		// 이름으로 모델 데이터 선언하여, ${emplist}로 뷰단에서 쓸 수 있게
		// 해놓는다.
		// service.getEmpList(sch)
		// 요청값을 vo롤 통해서 DB에 전달하고, 전달된 내용의 
		// 결과를 다시 객체로 받아서 모델명 emplist 설정을 한다.
		d.addAttribute("emplist", service.getEmpList(sch));
		
		
		return "WEB-INF\\views\\a02_mvc\\a01_empList.jsp";
	}
	
	
}
