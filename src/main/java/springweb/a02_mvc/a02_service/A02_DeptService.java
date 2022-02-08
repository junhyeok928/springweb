package springweb.a02_mvc.a02_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import springweb.a02_mvc.a03_dao.A02_DeptDao;
import springweb.vo.Dept;

@Controller
public class A02_DeptService {
	@Autowired
	private A02_DeptDao dao;
	
	public List<Dept> getDeptList(Dept sch){
		if(sch.getDname()==null) sch.setDname("");
		if(sch.getLoc()==null) sch.setLoc("");
		return dao.getDeptList(sch);
	}
	public void insertDept(Dept ins) {
		dao.insertDept(ins);
	}
}
