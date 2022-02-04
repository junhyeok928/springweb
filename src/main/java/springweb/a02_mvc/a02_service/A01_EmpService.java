package springweb.a02_mvc.a02_service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A01_EmpDao;
import springweb.vo.DeptSal;
import springweb.vo.Emp;

@Service
public class A01_EmpService {
	// A01_EmpDao인터페이스로 선언한 내용을 상속한 실제 객체가 컨테이너에서
	// 생성되어 있을 때, 사용..
	@Autowired
	private A01_EmpDao dao;
	
	public ArrayList<Emp> getEmpList(Emp sch){
		// controller   empList.do
		// 요청값으로 초기화면일 때, null을 ""으로 처리
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		
		dao.getCount(10);
		dao.getJobCount("A");		
		dao.getEmpDetail(7521);
/*
	public DeptSal getDeptSal(int deptno);
	public Emp getStaticsEmp(String div);
 * */		
		dao.getDeptSal(10);
		dao.getStaticsEmp("1");
		System.out.println("데이터 건수:"+dao.getEnames(10).size());
		// service는 현재 dao객체자 정상적으로 생성되어서
		// 사용하는 한지를 테스트 하는 용도로 호출하는 것이다.
		System.out.println("데이터 건수(job-empno):"+dao.getEmpnos("SALESMAN").size());
		System.out.println("데이터건수(dept-emp):"+ dao.getDeptEmp().size());
		
		return dao.getEmpList(sch);
	}
}
