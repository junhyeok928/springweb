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
	public String deptAjax() {
		return "WEB-INF\\views\\a02_mvc\\a06_deptAjaxList.jsp";
	}
	// http://localhost:7080/springweb/deptAjax01.do  dlist
	@GetMapping("/deptAjax01.do")
	public String deptAjax01(Dept sch, Model d) {
		d.addAttribute("dlist", service.getDeptList(sch));
		return "pageJsonReport";
	}
}
