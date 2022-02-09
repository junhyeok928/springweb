package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import oracle.net.aso.s;
import springweb.a02_mvc.a02_service.A02_DeptService;
import springweb.vo.Dept;

@Controller
public class A02_DeptController {
	
	@Autowired
	A02_DeptService service;
	
	@GetMapping("/deptList.do")
	public String deptlist(Dept sch, Model d) {
		d.addAttribute("dlist", service.getDeptList(sch));
		return "WEB-INF\\views\\a02_mvc\\a10_deptList.jsp";
	}
	
	@RequestMapping("/insertDept.do")
	public String insertDept(Dept ins, Model d) {
		d.addAttribute("proc", "등록완료");
		service.insertDept(ins);
		return "WEB-INF\\views\\a02_mvc\\a10_deptList.jsp";
	}
	@RequestMapping("/uptDept.do")
	public String uptDept(Dept upt, Model d){
		d.addAttribute("proc","부서수정완료");
		return "WEB-INF\\views\\a02_mvc\\a10_deptList.jsp";
	}	
}
