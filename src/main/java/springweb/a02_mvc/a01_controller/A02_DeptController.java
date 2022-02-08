package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a02_mvc.a02_service.A02_DeptService;
import springweb.vo.Dept;

@Controller
public class A02_DeptController {
	@Autowired
	private A02_DeptService service;
	
	// http://localhost:7080/springweb/deptList.do
	@RequestMapping("/deptList.do")
	public String deptList(Dept sch, Model d){
		
		d.addAttribute("dlist", service.getDeptList(sch));
		return "WEB-INF\\views\\a02_mvc\\a10_deptList.jsp";
	}
	@RequestMapping("/insertDept.do")
	public String insertDept(Dept ins, Model d){
		d.addAttribute("proc","등록완료");
		System.out.println("deptno:"+ins.getDeptno());
		service.insertDept(ins);
		// service
		return "WEB-INF\\views\\a02_mvc\\a10_deptList.jsp";
	}		
	
}
