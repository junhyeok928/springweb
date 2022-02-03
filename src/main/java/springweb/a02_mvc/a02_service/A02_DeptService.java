package springweb.a02_mvc.a02_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A02_DeptDao;

@Service
public class A02_DeptService {
	// A01_EmpDao 인터페이스로 선언한 내용을 상속한 실제 객체가 컨테이너에서
	// 생성되어 있을 때, 사용..
	@Autowired
	private A02_DeptDao dao;
	
	/*
	 * public ArrayList<Dept> getDeptList(Dept sch){ // controller empList.do //
	 * 요청값으로 초기화면일 때, null을 ""으로 처리 if(sch.getDname()==null) sch.setDname("");
	 * if(sch.getLoc()==null) sch.setLoc(""); dao.getCountCnt(10);
	 * dao.getDeptName(""); return dao.getDeptList(sch); }
	 */
}
