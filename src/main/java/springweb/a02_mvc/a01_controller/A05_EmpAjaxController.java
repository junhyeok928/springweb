package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import springweb.a02_mvc.a02_service.A01_EmpService;
import springweb.vo.Emp;

@Controller
public class A05_EmpAjaxController {
	@Autowired
	private A01_EmpService service;
	
	// 초기화면 호출 http://localhost:7080/springweb/empAjax.do
	
	@GetMapping("/empAjax.do")
	public String empAjaxFrm() {
		return "WEB-INF\\views\\a02_mvc\\a05_empAjaxList.jsp";
	}
	
	// ajax데이터 처리 
	// http://localhost:7080/springweb/empAjax01.do
	@GetMapping("/empAjax01.do")
	public String empAjax(Emp sch, Model d) {
		d.addAttribute("empList", service.getEmpList(sch));
		return "pageJsonReport"; // json View 호출..
		// ArrayList형 empList를 json 형식으로 json view에 의해 변경 처리해준다.
	}
	// http://localhost:7080/springweb/empAjaxDetail.do?empno=7654
	@GetMapping("/empAjaxDetail.do")
	public String empAjaxDetail(int empno, Model d) {
		d.addAttribute("emp", service.getEmp(empno));
		return "pageJsonReport"; // json View 호출..
		// ArrayList형 empList를 json 형식으로 json view에 의해 변경 처리해준다.
	}
	
	
	
}
