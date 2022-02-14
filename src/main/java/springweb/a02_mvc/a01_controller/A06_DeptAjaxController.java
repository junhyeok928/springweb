package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import springweb.a02_mvc.a02_service.A02_DeptService;
import springweb.vo.Dept;

@Controller
public class A06_DeptAjaxController {
	@Autowired
	private A02_DeptService service;
	
	@GetMapping("/deptAjax.do")
	public String deptAjaxFrm() {
		return "WEB-INF\\views\\a02_mvc\\a06_deptAjaxList.jsp";
	}
	// http://localhost:7080/springweb/deptAjax.do
	@GetMapping("/deptAjax01.do")
	public String deptAjax(Dept sch, Model d) {
		d.addAttribute("deptList", service.getDeptList(sch));
		return "pageJsonReport";
	}
}
